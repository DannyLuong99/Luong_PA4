package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {
    static ArrayList<String> uniqueWords = new ArrayList<String>();
    static int i;

    public static void remove(FileInputStream dataFile) throws IOException {
        // try to open data file

        try {
            dataFile = new FileInputStream("problem1.txt");
        }
        catch (IOException error) {
            System.out.println("Error: Input file was not found.");
            System.exit(0);
        }

        ArrayList<String> dataArray = new ArrayList<>();
        Scanner scnr = new Scanner(dataFile);

        while (scnr.hasNext()) {
            // copy data from file into array
            dataArray.add(scnr.next());
        }
        // traverse array and add unique words to other array
        for (i = 0; i < dataArray.size(); ++i) {
            if (uniqueWords.indexOf(dataArray.get(i)) == -1) {
                uniqueWords.add(dataArray.get(i));
            }
        }

        // close the data file
        dataFile.close();
    }

    public static void write(FileOutputStream outputFile) throws IOException {
        // try to open output file
        try {
            outputFile = new FileOutputStream("unique_words.txt");
        }
        catch (IOException error) {
            System.out.println("Error: Output file was not found.");
            System.exit(0);
        }

        PrintWriter outFS = new PrintWriter(outputFile);

        for (i = 0; i < uniqueWords.size(); ++i) {
            outFS.println(uniqueWords.get(i));
            outFS.flush();
        }

        // close the output file

        outputFile.close();
    }
}
