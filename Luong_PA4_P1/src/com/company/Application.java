package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Application {
// use duplicate remover
    public static void main(String[] args) throws IOException {



            FileInputStream dataFile = null;
            FileOutputStream outputFile = null;


            DuplicateRemover.remove(dataFile);
            DuplicateRemover.write(outputFile);
    }
}
