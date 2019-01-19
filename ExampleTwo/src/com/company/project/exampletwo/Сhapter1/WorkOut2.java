package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut2 extends HomeWork {
    @Override
    protected void info() {
        System.out.println("На основании примера HelloDate.java в этой главе напишитн программу \"Привет мир \", которая просто выводит это сообщение." +
                "Программа будет содержать только один метод(тот, который исполняется при запуске программы-main())." +
                "Не забудьте обьявить его статическим(static) и включите список аргументов, даже если вы не будете его использовать." +
                "Скопмилируйте программу с помощью javac и запустите на использывание из java. Если вы используете не JDK, а дргую среду разработки программ, выясните, как в ней компилируются и запускаются программы. ");
    }

    @Override
    protected void run() {
        System.out.println("Селям Алейкум");
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 2");
    }
}
