package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut5 extends HomeWork {
    @Override
    protected void info() {
        System.out.println("Измените упражнение 4 так,чтобы данные класса DataOnly присваивались значения, а затем распечатайте их в методе main()");
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
        System.out.println("Задание 5");
    }

    private class DataOnly{
        int i;
        double d;
        boolean b;
    }
}
