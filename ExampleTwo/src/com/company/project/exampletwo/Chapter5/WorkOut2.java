package com.company.project.exampletwo.Chapter5;

import com.company.project.exampletwo.HomeWork;
import com.company.project.exampletwo.*;

public class WorkOut2 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Создайте библеотека в соотвествии с фрагментами кода, содержащими описания access и Widget." +
                "Создавайте обьект Widget в классе, не входящем в пакет access");
    }

    @Override
    protected void run() {
        Widget widget=new Widget();
        widget.library();
    }

    @Override
    protected void nameProject() {
        System.out.println("2) Задание 7");
    }
}