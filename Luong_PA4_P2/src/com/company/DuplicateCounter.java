package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
    // create arraylist to store unique words
    static ArrayList<String> uniqueWords = new ArrayList<String>();
    // create map of strings to store how many times a word occurs
    static Map<String, Integer> duplicateWords = new HashMap<String, Integer>();

    // method to count how many time each word occurs in file
    public static void count(FileInputStream dataFile) throws IOException {

        try {
                dataFile = new FileInputStream("problem2.txt");
            }
        catch (IOException error) {
                System.out.println("Error: Input file was not found");
                System.exit(0);
            }

        ArrayList<String> dataArray = new ArrayList<>();
        Scanner scnr = new Scanner(dataFile);

        while (scnr.hasNext()) {
            // copy data from file into array
                dataArray.add(scnr.next());
            }

        // count how many times a word occurs
        for (int i = 0; i < dataArray.size(); ++i) {
                Integer word_count = duplicateWords.get(dataArray.get(i));
                    if (word_count == null) {
                            word_count = 0;
                        }
                duplicateWords.put(dataArray.get(i), word_count + 1);
            }

        // traverse array and add unique words to other array
        for (int i = 0; i < dataArray.size(); ++i) {
            if (uniqueWords.indexOf(dataArray.get(i)) == -1) {
                    uniqueWords.add(dataArray.get(i));
                }
            }
            // close data file
            dataFile.close();
        }

    // method to write data to output file
    public static void write(FileOutputStream outputFile) throws IOException {
        try {
                outputFile = new FileOutputStream("unique_word_counts.txt");
            }
        catch (IOException error) {
                System.out.println("Error: Output file was not found.");
                System.exit(0);
            }
        // print out word and how many times it occurs out to the output file
        PrintWriter outFS = new PrintWriter(outputFile);
        for (int i = 0; i < uniqueWords.size(); ++i) {
            outFS.printf("%-20s: %5d\n",uniqueWords.get(i), duplicateWords.get(uniqueWords.get(i)));

            }
        outFS.flush();

        outputFile.close();
    }
}
