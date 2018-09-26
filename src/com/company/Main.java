package com.company;

import com.company.sweets.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Candy candy = new Candy("Candy");
        Lollipop lollipop = new Lollipop("Lollipop");
        Jellybean jellybean = new Jellybean("Jellybean");
        Cookie cookie = new Cookie("Cookie"");
        Macaroon macaroon = new Macaroon("Macaroon");

        int countCandy;
        int countLollypop;
        int countJellybean;
        int countCookie;
        int countMacaroon;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество " + candy.getName());
        countCandy = scanner.nextInt();
        System.out.println("Введите количество " + lollipop.getName());
        countLollypop = scanner.nextInt();
        System.out.println("Введите количество " + jellybean.getName());
        countJellybean = scanner.nextInt();
        System.out.println("Введите количество " + cookie.getName());
        countCookie = scanner.nextInt();
        System.out.println("Введите количество " + macaroon.getName());
        countMacaroon = scanner.nextInt();


    }
}
