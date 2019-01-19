package com.company.project.exampletwo.Chapter3;

import com.company.project.exampletwo.HomeWork;

public class WorkOut1 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Напишите программу которая выводит от 1 до 100");
    }

    @Override
    protected void run() {
        for(int i=1;i<101;i++){
            System.out.print(i+" ");
            if (i==50){
                System.out.println();
            }
        }
    }

    @Override
    protected void nameProject() {
        System.out.println("1) Задание 15");
    }
}
