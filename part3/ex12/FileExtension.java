package com.horstmann.part3.ex12;

import java.io.File;
import java.io.FilenameFilter;

public class FileExtension implements FilenameFilter {

    private String ext;

    public FileExtension(String ext) {
        this.ext = ext.toLowerCase();
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(ext);
    }

    private static void printFileExt(String dir, String ext) {

        IFileExtPrint PrintF;

        PrintF = (dir1, ext1) -> {

            File file = new File(dir);

            if (!file.isDirectory()) {
                System.out.println(dir + " directory does not exist");
            }
            File[] listFiles = file.listFiles(new FileExtension(ext));

            if (listFiles.length == 0) {

                System.out.println(dir + " does not contain files with extension " + ext);

            } else {
                for (File f : listFiles) {
                    System.out.println("File: " + dir + File.separator + f.getName());
                }
            }
        };
        PrintF.printFile(dir, ext);
    }
}




















