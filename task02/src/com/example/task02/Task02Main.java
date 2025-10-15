package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        try {
            System.out.println(getSeason(1));    // Зима
            System.out.println(getSeason(3));    // Весна
            System.out.println(getSeason(6));    // Лето
            System.out.println(getSeason(9));    // Осень
            System.out.println(getSeason(12));   // Зима
            System.out.println(getSeason(-5));   // Исключение
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    static String getSeason(int monthNumber) {
        // Проверка на допустимость значения
        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException(
                "monthNumber " + monthNumber + " недопустимо, номер месяца должен быть в диапазоне от 1 до 12"
            );
        }
        
        // Определение сезона по номеру месяца
        if (monthNumber == 12 || monthNumber <= 2) {
            return "зима";
        } else if (monthNumber <= 5) {
            return "весна";
        } else if (monthNumber <= 8) {
            return "лето";
        } else {
            return "осень";
        }
    }
}
