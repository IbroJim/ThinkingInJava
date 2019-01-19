package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut6 extends HomeWork {

    @Override
    protected void info() {
        System.out.println("Напишите программу, включающую метод starage(),приведенный ранее в этой главе");
    }

    @Override
    protected void run() {
      returnString("Селям Алейкум");
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 6");
    }

    static int  returnString(String s){
        System.out.println(s.length()*2);
        return s.length()*2;
    }
}
