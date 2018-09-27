package com.company;

import com.company.sweets.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sweets[] sweets = new Sweets[5];
        sweets[0] = new Candy();
        sweets[1] = new Lollipop();
        sweets[2] = new Jellybean();
        sweets[3] = new Cookie();
        sweets[4] = new Macaroon();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Существует несколько видов сладостей: " + sweets[0].getName() + ", " + sweets[1].getName() + ", "
                + sweets[2].getName() + ", "
                + sweets[3].getName() + ", "
                + sweets[4].getName()
                + ". \nВыбери, что хочешь исключить из подарка. Если исключить нечего, то напиши -, "
                + "или напиши название того, что надо исключить:");
        String exception[] = scanner.nextLine().split(" ");
        if (!exception[0].equals("-")) {
            for (int i = 0; i < exception.length; i++) {
                for (int j = 0; j < sweets.length; j++){
                    exeptionFromNewYearsGift(sweets[j], exception[i]);
                }
            }
        } else {
            System.out.println("Из подарка ничего не исключаем.");
        }

        NewYearsGift newYearsGift = new NewYearsGift();

        System.out.println("Введите количество типа сладостей.");
        for (int i = 0; i < sweets.length; i++){
            int countSweets = countSweets(sweets[i]);
            newYearsGift.setTotalWeight(countSweets, sweets[i].getWeight());
            newYearsGift.setTotalPrice(countSweets, sweets[i].getPrice());
        }

        System.out.println("Информация о Новогднем подарке.\nОбщий вес: " + newYearsGift.getTotalWeight()
        + " грамм.\nОбщая стоимость: $" + newYearsGift.getTotalPrice() +
        "\nВ подарке: ");

        for (int i = 0; i < sweets.length; i++){
            if (sweets[i].isNewYearsGift()){
                System.out.println((i + 1) + ". " + sweets[i].getName()
                + "\n Вес: " + sweets[i].getWeight()
                + "\n Цена: $" + sweets[i].getPrice());
            }
        }

    }

    private static int countSweets(Sweets sweets) {
        Scanner scanner = new Scanner(System.in);
        if (sweets.isNewYearsGift()){
            System.out.print(sweets.getName() + ": ");
            return scanner.nextInt();
        }
        return 0;
    }

    private static void exeptionFromNewYearsGift(Sweets sweets, String exception) {
        if (exception.equals(sweets.getName()))
            sweets.setNewYearsGift(false);
    }
}
