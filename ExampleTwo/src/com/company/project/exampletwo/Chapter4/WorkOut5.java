package com.company.project.exampletwo.Chapter4;

import com.company.project.exampletwo.HomeWork;

import java.sql.SQLOutput;

public class WorkOut5 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Напишите метод, получающий список аргументов переменной длины с массивом String." +
                "Убедитесь в том, что этому методу может передаваться как список обьектов String, разделённых запятыми, так и String");
    }

    @Override
    protected void run() {
    testMethod(new String[]{"Ибраим","Айдер","Амет"});
    }


    @Override
    protected void nameProject() {
        System.out.println("5) Задание 19");
    }

    private static void testMethod(String[] mass){
        for (int i=0;i<mass.length;i++){
            System.out.println(mass[i]);
        }
    }
}
