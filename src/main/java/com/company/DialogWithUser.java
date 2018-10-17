package com.company;

import java.util.*;

public class DialogWithUser {

    public int generalMenu() {

        HashMap<Integer, String> menuMap = new HashMap<>();
        menuMap.put(1, "Создать новый подарок");
        menuMap.put(2, "Добавдить сладости в существующий подарок");
        menuMap.put(3, "Удалить сладости из существующего подарка");
        menuMap.put(4, "Удалить подарок");
        menuMap.put(5, "Вывести информацию о подарке");
        menuMap.put(6, "Выйти из программы");

        showMenu("\nВыберете действие (1,2,3 или 4):", menuMap);

        return getAction();
    }

    private int getAction() {
        Scanner scanner = new Scanner(System.in);
        int action = -1;
        try {
            action = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\nНеобходимо ввести номер действия, без точки. Попробуй еще.");
            scanner.next();
        }
        return action;
    }

    public String[] createSweetsMenu() {

        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> menuMap = new HashMap<>();
        menuMap.put(1, "Candy");
        menuMap.put(2, "Lollipop");
        menuMap.put(3, "Jellybean");
        menuMap.put(4, "Cookie");
        menuMap.put(5, "Macaroon");

        showMenu("\nДоступные сладости\nВыберете сладости для подарка (введите цифры чере пробел):", menuMap);

        String[] sweetsKeyList = scanner.nextLine().split(" ");

        return sweetsKeyList;
    }

    private void showMenu(String header, HashMap<Integer, String> menuMap) {

        System.out.println(header);

        for (Map.Entry m : menuMap.entrySet()) {
            System.out.println(m.getKey() + ". " + m.getValue());
        }
    }


}
