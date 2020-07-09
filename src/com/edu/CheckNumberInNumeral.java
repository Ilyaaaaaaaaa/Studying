package com.edu;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class CheckNumberInNumeral {
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i <= 3; i++) {
            if (n % 10 == 7) count++;
            n = n / 10;

        }
        if (count == 1) System.out.println("Число содержит только одну цифру 7");
//        while (i <= 3) {
//
//        }
//        do {
//
//       }
//        while(i <= 3);

        in.close();
    }
}
