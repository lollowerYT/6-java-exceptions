package com.example.task05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task05Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Необходимо указать путь к файлу");
            return;
        }
        
        String pathToFile = args[0];
        
        try {
            String s = readFile(pathToFile);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            System.err.println("файл \"" + pathToFile + "\" не найден");
        } catch (IOException e) {
            System.err.println("произошла ошибка при чтении файла \"" + pathToFile + "\"");
        }
    }

    public static String readFile(String pathToFile) throws IOException {
        try (FileReader fileReader = new FileReader(pathToFile);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            
            StringBuilder stringBuilder = new StringBuilder();
            String currentLine;
            
            while ((currentLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(currentLine);
                stringBuilder.append("\n");
            }
            
            return stringBuilder.toString();
        }
    }
}
