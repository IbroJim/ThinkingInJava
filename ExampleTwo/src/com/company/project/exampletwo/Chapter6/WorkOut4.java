package com.company.project.exampletwo.Chapter6;

import com.company.project.exampletwo.HomeWork;

public class WorkOut4 extends HomeWork {


    @Override
    protected void info() {
    System.out.println("Создайте класс в пакете. Ваш класс должен содержать метод со спецификатаром protected. " +
                "Попытайтесь вызвать метод protected за пределами пакета, и обьясните, что происходит. " +
                "Затем создайте класс, производный от вашего, и вызовите метод protected из другого метода вашего производного класса");
    }

    @Override
    protected void run() {
        System.out.println("На данныый момент наследовал данный класс от HomeWork в другом пакете." +
                "И переопрделил его protected методы");
    }

    @Override
    protected void nameProject() {
        System.out.println("4) Задание 15");
    }
}
