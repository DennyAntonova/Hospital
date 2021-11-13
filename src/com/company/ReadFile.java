package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {
    public static Object read(String csvFile) {
        List<String> usersList = new ArrayList<>();
        try {
            File file = new File(csvFile);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            usersList = bufferedReader.lines().collect(Collectors.toList());
            bufferedReader.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return usersList;
    }
}
