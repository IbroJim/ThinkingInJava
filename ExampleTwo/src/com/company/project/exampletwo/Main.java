package com.company.project.exampletwo;

import com.company.project.exampletwo.Chapter6.WorkOut6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Сальме Ибраим");
        //setupChapter();
        WorkOut6 workOut6=new WorkOut6();
        workOut6.run();


    }
    private static void setupChapter(){
        System.out.println("Выберите главу:");
        outputListInformation( DataList.chapterListName);
        System.out.println();
        Scanner scannerChapter=new Scanner(System.in);
        int chapter=scannerChapter.nextInt();
        chapter--;
        choiceChapter(chapter, DataList.chapterListName);
    }
    private static void outputListInformation(String[] listString){
        for(int i=0;i<listString.length;i++){
            System.out.println(listString[i]);
        }
    }
    private static void choiceChapter(int chapter,String[] listString){
        int count=0;
        for(int i=0;i<listString.length;i++){
            count++;
        }
        if (chapter>count){
            System.out.println("Вы ввели слишком большое число");
        }
        for(int i=0;i<listString.length;i++){
           if(chapter==i){
               System.out.println(listString[i]);
                getChapter(chapter);
           }
        }
    }
    private static void getChapter(int chapter){
        ArrayList<HomeWork[]> chapterList= DataList.returnChapterList();
        for (int i=0;i<chapterList.size();i++){
            if (chapter==i){
               outputChapterInformation(chapterList.get(i));
                System.out.println();
            }
        }
    }
    private static void outputChapterInformation(HomeWork[] homeWork){
        System.out.println("Выберите задание: ");
        for(int i=0;i<homeWork.length;i++){
             homeWork[i].nameProject();
        }

        Scanner scanner=new Scanner(System.in);
        int sc=scanner.nextInt();
        sc--;
        choiceWorkOut(sc,homeWork);
    }
    private static void choiceWorkOut(int position,HomeWork[] homeWork){
        for(int i=0;i<homeWork.length;i++){
            if(position==i){
                homeWork[i].info();
                homeWork[i].run();
            }
        }

        System.out.println("\n");
        System.out.println("Нажмите Enter для выбора заданий");
        Scanner scanner=new Scanner(System.in);
        String enter=scanner.nextLine();
        if (enter=="\n"){

        }
        while(enter!=null) {
            System.out.println(enter);

            if (enter.isEmpty()) {
                outputChapterInformation(homeWork);
            }

            if (scanner.hasNextLine()) {
                enter = scanner.nextLine();
            } else {
                enter = null;
            }
        }
    }

}
