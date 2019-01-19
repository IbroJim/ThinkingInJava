package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut9 extends HomeWork {

    @Override
    protected void info() {
        System.out.println("Напишите программу, демонстротирующую автоматическую упаковку примитивных типов");
    }

    @Override
    protected void run() {
      int i=7;
      long a=i;
        System.out.println(a);
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 9");
    }
}
