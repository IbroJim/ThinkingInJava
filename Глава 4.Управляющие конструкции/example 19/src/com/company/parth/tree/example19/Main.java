package com.company.parth.tree.example19;

import java.util.Scanner;

import static com.company.parth.tree.example19.Print.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        String result=i>0?Integer.toBinaryString(i):"i меньше 0";
        System.out.println(result);
    }

}
