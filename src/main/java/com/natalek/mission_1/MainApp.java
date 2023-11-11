package com.natalek.mission_1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        sayHiIfMore7();
        sayHiVyacheslav();
        multipleOf3();
    };

    //1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    public static void sayHiIfMore7() {
        float x;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите число: ");
            x = scanner.nextFloat();
        } while(x <= 7);
        System.out.println("Привет!");
        System.out.println("**********************************************");
    };

    /*2. Составить алгоритм: если введенное имя совпадает с Вячеслав,
    то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени" */
    public static void sayHiVyacheslav() {
        String str;
        Boolean s = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите имя: ");
            str = scanner.next();
            if (str.equals("Вячеслав")) {
                s = true;
                System.out.println("Привет, Вячеслав");
                System.out.println("**********************************************");
            } else System.out.println("Нет такого имени");
        } while (s == false);
    };

    //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    public static void multipleOf3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте длину числового массива: ");
        int ln = scanner.nextInt();
        int[] matrix = new int[ln];
        int i;
        for (i=0; i<=ln-1; i++) {
            System.out.print("Введите " + (i+1) + " элемент: ");
            matrix[i] = scanner.nextInt();
        };
        System.out.print("Ваша числовая последовательность: ");
        for (i=0; i<=ln-1; i++) {
            System.out.print(matrix[i] + " ");
        };
        System.out.println();
        System.out.print("В ней делятся на 3 следующие числа: ");
        for (i=0; i<=ln-1; i++){
            if (matrix[i]%3 == 0) {
                System.out.print(matrix[i] + " ");
            };
        };
    };
}
