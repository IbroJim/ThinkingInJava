package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut1 extends HomeWork {

     int i;
     char a;
    @Override
    protected void info() {
        System.out.println("Создайте класс с полями int и char, которые не инициализируются в программе " +
                "Выведите их значения, чтобы убедится в том, что Java выполняет инициализацию" );

    }

    @Override
    protected void run() {
        System.out.println("int i ="+i+"\n"+"char a ="+a);
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 1");
    }


}
