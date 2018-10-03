package com.company;

public class Main {

    public static void main(String[] args) {


        DialogWithUser dialogWithUser = new DialogWithUser();

        while (true){
            if (dialogWithUser.generalMenu() == 1){
                dialogWithUser.createNewYearsGiftMenu();
            }
        }
    }
}
