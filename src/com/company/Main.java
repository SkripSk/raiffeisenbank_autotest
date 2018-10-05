package com.company;

import com.company.sweets.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DialogWithUser dialogWithUser = new DialogWithUser();
        List<NewYearsGift> newYearsGiftList = new ArrayList<>();

        while (true){
            switch (dialogWithUser.generalMenu()) {
                case 1:
                    newYearsGiftList.add(createNewYearsGift());
                    break;
                case 2:
                    //TODO метод удаление подарка
                    break;
                case 3:
                    if (newYearsGiftList.isEmpty()) {
                        System.out.println("Подарков нет");
                    } else {
                        //printNewYearsGift(newYearsGiftList);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    private static NewYearsGift createNewYearsGift() {

        Scanner scanner = new Scanner(System.in);
        DialogWithUser dialogWithUser = new DialogWithUser();
        NewYearsGift newYearsGift = new NewYearsGift();

        System.out.println("Введите для кого создаем подарок: ");
        newYearsGift.setName(scanner.next());

        switch (dialogWithUser.createNewYearsGiftMenu()) {
            case 1:
                newYearsGift.setSweetsMap(newSweets());
                break;
            case 2:
                //removeSweets(newYearsGift.getSweetMap());
                break;
            case 3:
                    //printNewYearsGift(newYearsGiftList);
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
                break;
        }


        return newYearsGift;
    }

    private static HashMap<Sweets, Integer> newSweets() {

        DialogWithUser dialogWithUser = new DialogWithUser();
        Scanner scanner = new Scanner(System.in);
        HashMap<Sweets, Integer> sweetsMap = new HashMap<>();

        String[] sweetsKey = dialogWithUser.createSweetsMenu();

        for(int i = 0; i < sweetsKey.length; i++){
            switch (sweetsKey[i]) {
                case "1":

                    System.out.println("dfsf");
                    sweetsMap.put(new Candy(), scanner.nextInt());
                    break;
                case "2":
                    sweetsMap.put(new Lollipop(), 1);
                    break;
                case "3":
                    sweetsMap.put(new Jellybean(), 1);
                    break;
                case "4":
                    sweetsMap.put(new Cookie(), 1);
                    break;
                case "5":
                    sweetsMap.put(new Macaroon(), 1);
                    break;
            }
        }

        /*System.out.println("Введите количество сладостей:");
        for (int i = 0; i < sweetsMap.size(); i++){
            System.out.print(sweetsMap.get(i) + ": ");
            sweetsMap.keySet().toArray()[i]

        }*/


        return sweetsMap;
    }
}
