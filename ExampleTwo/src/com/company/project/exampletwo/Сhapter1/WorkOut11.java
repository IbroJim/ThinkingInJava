package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut11 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Преобразуйте пример с классом AllTheColorsOfTheRainbow в работающую программу");
    }

    @Override
    protected void run() {
     AllTheColorsRainbow example=new AllTheColorsRainbow();
     example.changeTheHueOfTheColor();
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 11");
    }

    private class AllTheColorsRainbow{
        int anIntegerRepresentingColors;
        void changeTheHueOfTheColor(){
            System.out.println("example 11");
        }
    }
}
