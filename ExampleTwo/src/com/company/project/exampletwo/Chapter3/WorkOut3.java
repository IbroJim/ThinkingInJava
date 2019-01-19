package com.company.project.exampletwo.Chapter3;

import com.company.project.exampletwo.HomeWork;

import java.util.Scanner;

public class WorkOut3 extends HomeWork {
    @Override
    protected void info() {
        System.out.println("Напишите метод, который получает целочисленный аргумент и выводит указанное количесвто чисел Фибоначчи.");
    }

    @Override
    protected void run() {
        int a=1,b=1,c=0;
        boolean check=true;
        Scanner scanner=new Scanner(System.in);
        int value=scanner.nextInt();
        while (check) {
            c = a + b;
            System.out.println(c);
            b=a;
            a=c;
            c=0;
            if(value==a){
                check=false;
            }

        }
    }

    @Override
    protected void nameProject() {
        System.out.println("3) Задание 23");
    }
}
