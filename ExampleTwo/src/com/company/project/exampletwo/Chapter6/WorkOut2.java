package com.company.project.exampletwo.Chapter6;

import com.company.project.exampletwo.HomeWork;

public class WorkOut2 extends HomeWork {

    @Override
    protected void info() {
        System.out.println("Измените упражнение 5 так, чтобы классы A и B имели конструктор с аргументами вместо конструтора по умалчанию." +
                "Напишите конструктор для класса С и проведите всю необходимую инициализацию внутри него");
    }

    @Override
    protected void run() {
        System.out.println("Инициализируем класс C");
        C c=new C("Hello");

    }

    @Override
    protected void nameProject() {
        System.out.println("2) Задание 6");
    }

   private class A{
        A(String s){
            System.out.println("Аргумент класса A"+s);
        }
    }
    private class B{
        B(int s){
            System.out.println("Аргумент класса B"+s);
        }
    }
   private class C extends A{
        B b=new B(12);
        C(String s) {
            super(s);
        }

    }
}
