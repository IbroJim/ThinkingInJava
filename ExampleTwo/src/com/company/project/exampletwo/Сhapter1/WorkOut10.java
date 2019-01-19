package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut10 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Напишите программу, которая выводит три параметра командной строки." +
                "Для получения аргументов вам потребуется обращение к элементам массива строк (String)" );
    }

    @Override
    protected void run() {
        main(new String[]{"1","2","3"});
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 10");
    }

    public static void main(String[] args){
     for (int i=0;i>args.length;i++){
         System.out.println(args[i]);
     }
    }
}
