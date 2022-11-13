package com.company;

import java.util.Scanner;

import static com.company.Director.directorInputLgPw;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, авторизуйтесь");
        chooseUsers();
    }

    // Выбор Аккаунта
    public static String chooseUsers() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите вашу специальность :");
        System.out.println("(1) Директор");
        System.out.println("(2) Работник");
        System.out.println("(3) Продавец    ");
        do {
            System.out.print("Ваш выбор: ");
            String choose = sc.nextLine();
            switch (choose) {
                case "director":
                case "Director":
                case "1":
                    System.out.println("Добро пожаловать Директор");
                    System.out.println("Введите логин и пароль");
                    directorInputLgPw();
                    break;
                case "worker":
                case "Worker":
                case "2":
                    System.out.println("Добро пожаловать Работник");
                    System.out.println("Введите логин и пароль");
//                    workerInputLgPw();
                    break;
                case "seller":
                case "Seller":
                case "3":
                    System.out.println("Добро пожаловать Продавец!");
                    System.out.println("Введите логин и пароль");
//                    deliverymanInputLgPw();
                    break;
                default:
                    System.out.println("Кто ты воин?");
                    System.out.print("Желаете выйти[1] или повторить[0]? ");
                    int ex = sc.nextInt();
                    if (ex == 0){
                        chooseUsers();
                    }
                    else if(ex == 1){
                        System.exit(0);
                    }
            }
            break;
        } while (true);
        return "";
    }
}
