package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Director {

    // Авторизация директора
    public static void directorInputLgPw() {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("Director");
        passwordArrayList.add("Director1");
        loginArrayList.add("director");
        passwordArrayList.add("director1");
        loginArrayList.add("Dir");
        passwordArrayList.add("Dir1");
        loginArrayList.add("dir");
        passwordArrayList.add("dir1");

        do {
            System.out.print("Введите логин: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Введите пароль: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Директор, вы успешно вошли!");
//                directorActions();
                break;
            } else {
                System.out.println("Попытайтесь снова");
            }
        } while (true);
    }

//    // Действия директора
//    public static void directorActions() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Меню:");
//        System.out.println("(1)Показать список всей бытовой техники");
//        System.out.println("(2)Показать количество бытовой техники");
//        System.out.println("(3)Максимальное количество бытовой техники");
//        System.out.println("(4)Минимальное количество бытовой техники");
//        System.out.println("(5)Отчет по закупкам бытовой техники");
//        System.out.println("(0)Выход");
//        do {
//            System.out.print("Ваш выбор: ");
//            String chooseAction = sc.nextLine();
//            switch (chooseAction) {
//                case "action1":
//                case "Action1":
//                case "1":
//                    System.out.println("Действие 1");
//                    action1();
//                    directorActions();
//                    break;
//                case "action2":
//                case "Action2":
//                case "2":
//                    System.out.println("Действие 2");
//                    action2();
//                    directorActions();
//                    break;
//                case "action3":
//                case "Action3":
//                case "3":
//                    System.out.println("Действие 3");
//                    action3();
//                    directorActions();
//                    break;
//                case "action4":
//                case "Action4":
//                case "4":
//                    System.out.println("Действие 4");
//                    action4();
//                    directorActions();
//                    break;
//                case "action5":
//                case "Action5":
//                case "5":
//                    System.out.println("Действие 5");
//                    action5();
//                    directorActions();
//                    break;
//                default:
//                    System.out.println("Такого действия нет в программе!");
//                    directorActions();
//                    break;
//                case "n":
//                    try {
//                        chooseUsers();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                case "action0":
//                case "Action0":
//                case "0":
//                    System.out.println("Выход");
//                    break;
//            }
//            break;
//        } while (true);
//    }
//
//    public static void action1() {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"));
//            while (br.ready()) {
//                System.out.print(br.readLine() + " ");
//            }
//            System.out.println();
//            br.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void action2() {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"));
//            int count = 0;
//            while (br.ready()) {
//                br.readLine();
//                count++;
//            }
//            BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\zak.txt"));
//            int count1 = 0;
//            while (br1.ready()) {
//                br1.readLine();
//                count1++;
//            }
//            System.out.println("Всего товаров = " + (int) (count + count1));
//            br1.close();
//            br.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void action3() {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"));
//            HashMap<String, Integer> d = new HashMap<>();
//            while (br.ready()) {
//                String line = br.readLine();
//                if (d.containsKey(line)) {
//                    d.put(line, (int) (d.get(line) + 1));
//                } else {
//                    d.put(line, 1);
//                }
//            }
//
//            System.out.println(d);
//            String s = "dsd";
//            int m = 0;
//            for (String i : d.keySet()) {
//                if (d.get(i) > m) {
//                    m = d.get(i);
//                    s = i;
//                }
//            }
//            System.out.println("Максимальное количество бытовой техники " + s);
//            br.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void action4() {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"));
//            HashMap<String, Integer> d = new HashMap<>();
//            while (br.ready()) {
//                String line = br.readLine();
//                if (d.containsKey(line)) {
//                    d.put(line, (int) (d.get(line) + 1));
//                } else {
//                    d.put(line, 1);
//                }
//            }
//            System.out.println(d);
//            String s = "dsd";
//            int m = 100;
//            for (String i : d.keySet()) {
//                if (d.get(i) < m) {
//                    m = d.get(i);
//                    s = i;
//                }
//            }
//            System.out.println("Минимальное количество бытовой техники:"+ s);
//            br.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void action5() {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"));
//            System.out.print("Доставленная бытовая техника ");
//            int countLine = 0;
//            while (br.ready()) {
//                System.out.print(br.readLine() + ", ");
//                countLine++;
//            }
//            System.out.println("Количество = " + countLine);
//            BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\zak.txt"));
//            System.out.print("Заказанная бытовая техника ");
//            int countline = 0;
//            while (br1.ready()) {
//                System.out.print(br1.readLine() + ", ");
//                countline++;
//            }
//            System.out.println("Количество = " + countline);
//            br1.close();
//            br.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
}
