package com.horstmann.part3.ex13;

import java.io.File;
import java.util.Arrays;

public class FileSort {

    File dir = null;
    File[] paths;
    CompareFiles[] files;

    public FileSort(File dir) {
        this.dir = dir;
        paths = this.dir.listFiles();
    }

    public CompareFiles[] sort() {

        files = new CompareFiles[paths.length];

        ISortFiles sortF;

        sortF = (files1) -> {

            for (int i = 0; i < paths.length; i++) {
                files[i] = new CompareFiles(paths[i]);
            }
            Arrays.sort(files);

            return files1;
        };

        sortF.sorting(files);
        return files;
    }

    public void print() {

        for (File file : paths) {
            System.out.println(file.getName() + " - " + file.length());
        }
    }
}



















