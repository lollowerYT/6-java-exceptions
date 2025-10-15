package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
        Task07Main main = new Task07Main();
        
        main.processor = new Processor();
        
        System.out.println("Тип исключения: " + main.getExceptionType());
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();
            return NONE;  // Если исключение не возникло, возвращаем NONE
        } catch (RuntimeException e) {
            return UNCHECKED; // Если возникло RuntimeException или его подтип - это unchecked
        } catch (Exception e) {
            return CHECKED;  // Все остальные исключения - checked
        }
    }
}
}
