package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GradeConverter gradeConverter = new GradeConverter();

        for (int i = 0; i < 105; i++) {
            System.out.println(i + ": " + gradeConverter.convert(i));
        }
    }
}