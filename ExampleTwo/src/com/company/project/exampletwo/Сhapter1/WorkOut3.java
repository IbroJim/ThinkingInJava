package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut3 extends HomeWork {
    @Override
    protected void info() {
        System.out.println("Yfqlbnt ahfuvtyn кода с классом ATypeName и сделайте из него программу, пригодную для компиляции и запуска");
    }

    @Override
    protected void run() {
       ATypeName aTypeName=new ATypeName();
       aTypeName.hello();
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 3");
    }

    private class ATypeName{
        private String title="Селям";
        public void hello(){
            System.out.println(title);
        }

    }
}