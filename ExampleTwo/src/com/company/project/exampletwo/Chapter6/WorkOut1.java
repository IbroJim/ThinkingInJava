package com.company.project.exampletwo.Chapter6;

import com.company.project.exampletwo.HomeWork;

public class WorkOut1 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Доказать что при инициализации обьектов, в первую очередь инициализируется его родитель");
    }

    @Override
    protected void run() {
        System.out.println("Инициализируем обьекто Carton");
     Carton carton=new Carton();
    }

    class Art{
        Art(){
            System.out.println("Конструктор Art");
        }
    }
    class Drawing extends Art{
        Drawing(){
            System.out.println("Класс Drawing наследуется от Art");
        }
    }
    class Carton extends Drawing{
        Carton(){
            System.out.println("Класс Carton наследуется от Drawing");
        }
    }

    @Override
    protected void nameProject() {
        System.out.println("1) Задание 3");
    }
}
