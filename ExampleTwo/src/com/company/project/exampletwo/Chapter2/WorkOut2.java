package com.company.project.exampletwo.Chapter2;

import com.company.project.exampletwo.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class WorkOut2 extends HomeWork {
    @Override
    protected void info() {
        System.out.println("Напишите программу, моделирующую бросок монетки");
    }

    @Override
    protected void run() {
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

    @Override
    protected void nameProject() {
        System.out.println("2) Задание 7");
    }
}
