package com.horstmann.part3.ex13;

import java.io.File;

public class CompareFiles implements Comparable {

    public long len;
    public File file;

    public CompareFiles(File file) {
        file = file;
        len = file.length();
    }

    @Override
    public int compareTo(Object o) {

        long other = ((CompareFiles) o).len;
        return Long.compare(len, other);
    }
}
