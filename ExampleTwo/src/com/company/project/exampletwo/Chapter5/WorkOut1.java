package com.company.project.exampletwo.Chapter5;

import com.company.project.exampletwo.Chapter5.debug.Test;
import com.company.project.exampletwo.HomeWork;

public class WorkOut1 extends HomeWork {

    @Override
    protected void info() {
        System.out.println("Создайте два пакета debug и debuoff, содержащие одинокавые классы с методом debug(). " +
                "Первая версия выводит на консоль свой аргумент типа String, вторая не делает ничего." +
                "Используйте директеву static import для импортированния класса в тестовую программу и продемонстрируйте эффект условной компиляции.");
    }

    @Override
    protected void run() {
        System.out.println("метод printText из пакета debug");
        Test test=new Test();
        test.printText();
        System.out.println("метод printText из пакета debugoff");
        com.company.project.exampletwo.Chapter5.debugoff.Test test1=new com.company.project.exampletwo.Chapter5.debugoff.Test();
        test1.printText();
    }

    @Override
    protected void nameProject() {
        System.out.println("1) Задание 3");
    }
}
