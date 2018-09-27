package com.company;

import com.company.sweets.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Candy candy = new Candy("Candy");
        Lollipop lollipop = new Lollipop("Lollipop");
        Jellybean jellybean = new Jellybean("Jellybean");
        Cookie cookie = new Cookie("Cookie");
        Macaroon macaroon = new Macaroon("Macaroon");

        int countCandy;
        int countLollipop;
        int countJellybean;
        int countCookie;
        int countMacaroon;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Существует несколько видов сладостей: " + candy.getName() + ", " + lollipop.getName() + ", "
                + jellybean.getName() + ", "
                + cookie.getName() + ", "
                + macaroon.getName()
                + ". \nВыбери, что хочешь исключить из подарка. Если исключить нечего, то напиши -, "
                + "или напиши название того, что надо исключить");
        String exception[] = scanner.nextLine().split(" ");
        for (int i = 0; i < exception.length; i++){
            exeptionFromNewYearsGift(candy, exception[i]);
        }

    }

    private static void exeptionFromNewYearsGift(Sweets sweets, String exception) {
        if (exception.equals(sweets.getName()))
            sweets.setNewYearsGift(false);
    }
}
