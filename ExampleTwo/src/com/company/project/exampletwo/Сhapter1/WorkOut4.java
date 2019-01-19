package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut4 extends HomeWork {
    @Override
    protected void info() {
        System.out.println("Найдите фргамент кода с классом DataOnly и сделайте из него программу, пригодную для компиляции и запуска");
    }

    @Override
    protected void run() {
        DataOnly dataOnly=new DataOnly();
        dataOnly.i=4;
        dataOnly.b=true;
        dataOnly.d=14.4d;
        System.out.println("int i="+dataOnly.i+"\n"+"double d="+dataOnly.d+"\n"+"boolean b="+dataOnly.b);
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 4");
    }

    private class DataOnly{
        int i;
        double d;
        boolean b;
    }
}
