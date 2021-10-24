package com.ankesh.learning;

import java.util.Scanner;

@MyAnnotation
public class Cipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        int k = scanner.nextInt();

        StringBuilder builder = new StringBuilder(input.length());
        for (int i = 0; i < n; i++) {
            char temp = input.charAt(i);
            boolean upperCase = Character.isUpperCase(temp);
            if (Character.isLetter(temp)) {
                temp += k ;
                if (!Character.isLetter(temp) || (upperCase && !Character.isUpperCase(temp))) {
                    temp -= 26;
                }
            }
            builder.append(temp);
        }
        System.out.println(builder.toString());
    }
}