package com.company;

import com.company.sweets.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Candy candy = new Candy("Candy",12.0,0.3,"Sandt");
        Lollipop lollipop = new Lollipop("Lollipop", 80.0, 2.0, "pink");
        Jellybean jellybean = new Jellybean("Jellybean", 50.0, 1.0, 10);
        Cookie cookie = new Cookie("Cookie", 100.0, 2.5,"Gingery-snap");
        Macaroon macaroon = new Macaroon("Macaroon", 25.0,1.0,"Mint");

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
