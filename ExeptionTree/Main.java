package com.company.homework10.ExeptionTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите число больше 0");

        MethodExeption methodExeption =  new MethodExeption();
        methodExeption.methExc(in.nextInt());
        methodExeption.methProcess(in.nextInt());
    }
}