package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        Task06Main task = new Task06Main();
        
        // Пример вызова из main
        task.printMethodName();
        
        // Дополнительные методы для демонстрации
        task.method1();
        task.method2();
    }
    
    // Дополнительные методы для тестирования
    void method1() {printMethodName();}
    void method2() {printMethodName();}

    void printMethodName() {
        // Текущий стек вызовов
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        
        // 0 - всегда указывает на метод getStackTrace()
        // 1 - указывает на метод printMethodName()
        // 2 - содержит информацию о методе, который вызвал printMethodName()
        StackTraceElement callerMethod = stackTrace[2];

        System.out.println("Метод вызван из: " + callerMethod.getMethodName());
    }
}
