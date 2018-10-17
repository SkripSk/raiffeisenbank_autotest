package com.company;

import com.company.annotation.KindOf;
import com.company.sweets.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        DialogWithUser dialogWithUser = new DialogWithUser();
        List<NewYearsGift> newYearsGiftList = new ArrayList<>();

        while (true) {
            switch (dialogWithUser.generalMenu()) {
                case 1:
                    newYearsGiftList.add(createNewYearsGift());
                    break;
                case 2:
                    break;
                case 3:
                    removeSweets(newYearsGiftList);
                    break;
                case 4:
                    //TODO метод удаление подарка
                    break;
                case 5:
                    if (newYearsGiftList.isEmpty()) {
                        System.out.println("Подарков нет");
                    } else {
                        printNewYearsGift(newYearsGiftList);
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void removeSweets(List<NewYearsGift> newYearsGiftList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите имя для кого предназначен подарок: ");
        String name = scanner.next();
        String deleteFlg = "";
        for (int i = 0; i < newYearsGiftList.size(); i++) {
            if (!newYearsGiftList.get(i).getName().equals(name)) {
                System.out.println("Подарка для этого человека нет.");
            } else {
                NewYearsGift gift = newYearsGiftList.get(i);
                for (Map.Entry<Sweets, Integer> entry : gift.getSweetMap().entrySet()){
                    System.out  .println(entry.getKey().getName() + " удалить?");
                    //TODO переписать метод удаления. этот выдает ошибку
                    deleteFlg = scanner.next();
                    if (deleteFlg.equals("y")){
                        gift.getSweetMap().remove(entry.getKey(),entry.getValue());
                        System.out.println("Сладость удалена");
                    }
                }
            }
        }
    }

    private static void printNewYearsGift(List<NewYearsGift> newYearsGiftList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите имя для кого предназначен подарок: ");
        String name = scanner.next();
        for (int i = 0; i < newYearsGiftList.size(); i++) {
            if (!newYearsGiftList.get(i).getName().equals(name)) {
                System.out.println("Подарка для этого человека нет.");
            } else {
                NewYearsGift gift = newYearsGiftList.get(i);
                System.out.println("\nПодарок для " + gift.getName());
                System.out.println("Общий вес подарка: " + gift.getTotalWeight() + "гр."
                        + "\nОбщая стоимость подарка: $" + gift.getTotalPrice()
                        + "\nВиды сладостей - " + gift.getSweetMap().size() + ":");
                for (Map.Entry<Sweets, Integer> entry : gift.getSweetMap().entrySet()) {
                    System.out.println(entry.getKey().getName() + ": " + entry.getValue() + "шт.");
                    System.out.println("Цена за шт.: $" + entry.getKey().getPrice()
                            + "\nВес шт.: " + entry.getKey().getWeight()
                    + "\nВид: " + entry.getKey().getClass().getAnnotation(KindOf.class).kindOf());
                }
            }
        }
    }

    private static NewYearsGift createNewYearsGift() {

        Scanner scanner = new Scanner(System.in);
        NewYearsGift newYearsGift = new NewYearsGift();

        System.out.println("Введите для кого создаем подарок: ");
        newYearsGift.setName(scanner.next());
        newYearsGift.setSweetsMap(newSweets());

        return newYearsGift;
    }

    private static HashMap<Sweets, Integer> newSweets() {

        DialogWithUser dialogWithUser = new DialogWithUser();
        Scanner scanner = new Scanner(System.in);
        HashMap<Sweets, Integer> sweetsMap = new HashMap<>();

        String[] sweetsKey = dialogWithUser.createSweetsMenu();

        for (int i = 0; i < sweetsKey.length; i++) {
            switch (sweetsKey[i]) {
                case "1":
                    System.out.println("Введите количество Candy: ");
                    sweetsMap.put(new Candy(), scanner.nextInt());
                    break;
                case "2":
                    System.out.println("Введите количество Lollipop: ");
                    sweetsMap.put(new Lollipop(), scanner.nextInt());
                    break;
                case "3":
                    System.out.println("Введите количество Jellybean: ");
                    sweetsMap.put(new Jellybean(), scanner.nextInt());
                    break;
                case "4":
                    System.out.println("Введите количество Cookie: ");
                    sweetsMap.put(new Cookie(), scanner.nextInt());
                    break;
                case "5":
                    System.out.println("Введите количество Macaroon: ");
                    sweetsMap.put(new Macaroon(), scanner.nextInt());
                    break;
            }
        }
        return sweetsMap;
    }
}
