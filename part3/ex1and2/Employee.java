package com.horstmann.part3.ex1and2;

public class Employee implements Measurable {

    private double salary;
    private double experience;
    private int absenteeism;
    private int workHours;
    private String name;

    public Employee(String name, double experience, int absenteeism, int workHours) {
        this.name = name;
        this.experience = experience;
        this.absenteeism = absenteeism;
        this.workHours = workHours;
    }

    public Employee() {
    }

    public double average(Measurable[] objects) {

        double avgSalary = 0;
        for (int i = 0; i < objects.length; i++) {
            avgSalary += objects[i].getMeasure();
        }
        return avgSalary / objects.length;
    }

    @Override
    public double getMeasure() {
        salary = ((experience + workHours) - (absenteeism * 2)) * 100;
        return salary;
    }

    //cast is needed to use all the functions of the inheritor-class
    @Override
    public String largestSalary(Measurable[] objects) {
        Employee empl = (Employee) objects[0];

        for (int i = 0; i < objects.length; i++) {

            if (objects[i].getMeasure() > empl.getSalary()) {
                empl = (Employee) objects[i];
            }
        }
        return empl.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbsenteeism(int absenteeism) {
        this.absenteeism = absenteeism;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getSalary() {
        return salary;
    }

    public double getExperience() {
        return experience;
    }

    public int getAbsenteeism() {
        return absenteeism;
    }

    public int getWorkHours() {
        return workHours;
    }
}
