package com.company;

import com.company.sweets.*;

import java.util.*;

public class DialogWithUser {

    public int generalMenu() {

        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> menuMap = new HashMap<>();
        menuMap.put(1, "Создать новый подарок");
        menuMap.put(2, "Удалить подарок");
        menuMap.put(3, "Вывести информацию о подарке");
        menuMap.put(4, "Выйти из программы");

        showMenu("Выберете действие (1,2,3 или 4):", menuMap);

        int action = scanner.nextInt();

        return action;
    }

    public int createNewYearsGiftMenu() {

        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> menuMap = new HashMap<>();
        menuMap.put(1, "Добавить сладость в подарок");
        menuMap.put(2, "Удалить сладость из подарка");
        menuMap.put(3, "Вывести информацию о подарке");
        menuMap.put(4, "Выйти из меню (вернуться в основное меню)");
        menuMap.put(5, "Выйти из программы");

        showMenu( " Создание нового подарка\nВыберете действие (1,2,3,4 или 5):", menuMap);

        int action = scanner.nextInt();

        return action;
    }

    private void showMenu(String header, HashMap<Integer, String> menuMap) {

        System.out.println(header);

        for(Map.Entry m : menuMap.entrySet()) {
            System.out.println(m.getKey() + ". " + m.getValue());
        }
    }


}
