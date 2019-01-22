package com.company.project.exampletwo;

import com.company.project.exampletwo.Сhapter1.*;

import java.util.ArrayList;

public class DataList {
   private static HomeWork[] chapter1=new HomeWork[]{new WorkOut1(),new WorkOut2(),new WorkOut3(),new WorkOut4(),new WorkOut5(),new WorkOut6(),new WorkOut7(),new WorkOut8(),new WorkOut9(),new WorkOut10(),new WorkOut11(),new WorkOut12(),new WorkOut13(),new WorkOut14(),new WorkOut15(),new WorkOut16()};
   private static HomeWork[] chapter2=new HomeWork[]{new com.company.project.exampletwo.Chapter2.WorkOut1(),new com.company.project.exampletwo.Chapter2.WorkOut2(),new com.company.project.exampletwo.Chapter2.WorkOut3()};
   private static HomeWork[] chapter3=new HomeWork[]{new com.company.project.exampletwo.Chapter3.WorkOut1(),new com.company.project.exampletwo.Chapter3.WorkOut2(),new com.company.project.exampletwo.Chapter3.WorkOut3()};
   private static HomeWork[] chapter4=new HomeWork[]{new com.company.project.exampletwo.Chapter4.WorkOut1(),new com.company.project.exampletwo.Chapter4.WorkOut2(),new com.company.project.exampletwo.Chapter4.WorkOut3(),new com.company.project.exampletwo.Chapter4.WorkOut4(),new com.company.project.exampletwo.Chapter4.WorkOut5()};
   private static HomeWork[] chapter5=new HomeWork[]{new com.company.project.exampletwo.Chapter5.WorkOut1(),new com.company.project.exampletwo.Chapter5.WorkOut2()};
   private static HomeWork[] chapter6=new HomeWork[]{new com.company.project.exampletwo.Chapter6.WorkOut1(),new com.company.project.exampletwo.Chapter6.WorkOut2(),new com.company.project.exampletwo.Chapter6.WorkOut3(),new com.company.project.exampletwo.Chapter6.WorkOut4(),new com.company.project.exampletwo.Chapter6.WorkOut5(),new com.company.project.exampletwo.Chapter6.WorkOut6()};
   private static HomeWork[] chapter7=new HomeWork[]{new com.company.project.exampletwo.Chapter7.WorkOut1(),new com.company.project.exampletwo.Chapter7.WorkOut2(),new com.company.project.exampletwo.Chapter7.WorkOut3(),new com.company.project.exampletwo.Chapter7.WorkOut4()};




    public static final String []chapterListName=new String[]{"1: Все является обьектом","2: Операторы","3: Управляющие конструкции","4: Инициализация и завершение","5: Управление доступом",
            "6: Повторное использование классов","7: Полиформизм"};

    public static ArrayList<HomeWork[]> returnChapterList(){
        ArrayList<HomeWork[]> chapterList=new ArrayList<>();
        chapterList.add(chapter1);
        chapterList.add(chapter2);
        chapterList.add(chapter3);
        chapterList.add(chapter4);
        chapterList.add(chapter5);
        chapterList.add(chapter6);
        chapterList.add(chapter7);
        return chapterList;
    }



}
