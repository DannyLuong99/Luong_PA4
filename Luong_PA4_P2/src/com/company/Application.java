package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        FileInputStream dataFile = null;
        FileOutputStream outputFile = null;

        DuplicateCounter.count(dataFile);
        DuplicateCounter.write(outputFile);
    }
}
