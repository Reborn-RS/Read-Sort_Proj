package com.scaler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;


// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String readFileAsString(String fileName)
            throws Exception {
        String data = "";
        data = new String(
                Files.readAllBytes(Paths.get(fileName)));
        return data;
    }


    public static void main(String[] args) throws Exception {
        String data1 = readFileAsString(
                "/Users/rohitsaini/Desktop/scaler_java/read_text_files_21-05-23/in1.txt");
        String data2 = readFileAsString(
                "/Users/rohitsaini/Desktop/scaler_java/read_text_files_21-05-23/in2.txt");

        String[] s1 = data1.trim().split(" ");
        String[] s2 = data2.trim().split(" ");

        ArrayList<Integer> list1 = new ArrayList<>();
        for (String s : s1) {
            list1.add(Integer.parseInt(s));
        }
        for (String s : s2) {
            list1.add(Integer.parseInt(s));
        }
        Collections.sort(list1);
        FileWriter fileWriter = new FileWriter("/Users/rohitsaini/Desktop/scaler_java/read_text_files_21-05-23/output.txt");
        for (Integer str : list1) {
            fileWriter.write(str + System.lineSeparator());
        }
        fileWriter.close();
    }
}