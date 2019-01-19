package com.company.project.exampletwo.Chapter6;

import com.company.project.exampletwo.HomeWork;

public class WorkOut6 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("");
    }

    @Override
    public void run() {
        System.out.println("Инициализируем класс B");
        B b=new B();
        System.out.println("Сначала были проинициализировали все статические поля а потом был создан обьект");

    }

    @Override
    protected void nameProject() {
        System.out.println("6) Задание 23");
    }

    private static class A{
        A(){
            System.out.println("инициализируется класс A");
        }
        private static int i=print("Инициализируем static int i");
         static int print(String s){
             System.out.println(s);
             return 10;
         }
    }
    private static class B extends A{
        private static int i=print("Инициализируем static int i");
        static int print(String s){
            System.out.println(s);
            return 10;
        }
        B(){
            System.out.println("Иниициализируется класс B который наследуется от A");
        }

    }
}
