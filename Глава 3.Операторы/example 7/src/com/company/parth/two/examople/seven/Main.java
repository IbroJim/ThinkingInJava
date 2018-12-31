package com.company.parth.two.examople.seven;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        while (true) {
            System.out.println("Введите 1 для начала игры ");
            int startGame = scanner.nextInt();
            if (startGame == 1) {
                int value = random.nextInt(2);
                if (value == 0) {
                    System.out.println("Решка");
                } else {
                    System.out.println("Орёл");
                }
            }
        }

    }
}
