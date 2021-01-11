package com.horstmann.part3.ex11to13;

import java.io.File;

public class Subdirectories {

    public void printSubdirectories(File dir) {
        Printable show;

        show = (newDir) -> {
            for (File item : dir.listFiles()) {

                if (item.isDirectory()) {

                    System.out.println(item.getName() + " folder");
                } else {

                    System.out.println(item.getName() + " file");
                }
            }
        };
        show.print(dir);
    }


    public void printSubdirectoriesAnonim(File dir) {

        IPrintDir pd = new IPrintDir() {
            @Override
            public void printSubDir(File dir) {
                for (File item : dir.listFiles()) {

                    if (item.isDirectory()) {

                        System.out.println(item.getName() + " folder");
                    } else {

                        System.out.println(item.getName() + " file");
                    }
                }
            }
        };
    }
}
