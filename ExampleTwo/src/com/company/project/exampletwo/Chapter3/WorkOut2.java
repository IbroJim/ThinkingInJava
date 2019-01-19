package com.company.project.exampletwo.Chapter3;

import com.company.project.exampletwo.HomeWork;

import java.util.Scanner;

public class WorkOut2 extends HomeWork {
    @Override
    protected void info() {
        System.out.println("Повторите упражнение 1 из предыдущей главы, используя тернарный оператор и поразрядную проверку для вывода нулей и единиц");
    }

    @Override
    protected void run() {
        System.out.println("Введите число");
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        String result=i>0?Integer.toBinaryString(i):"i меньше 0";
        System.out.println(result);

    }

    @Override
    protected void nameProject() {
        System.out.println("2) Задание 19");
    }

}
