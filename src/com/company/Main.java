package com.company;


import java.util.ArrayList;
import java.util.Scanner;


import static com.company.ReadFile.read;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to online system Hospital");
        System.out.println("For doctors, press 1.");
        System.out.println("For patients, press 2.");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            String doctors = "D:\\DigitalMontana\\Hospital-master\\src\\com\\company\\doctors.csv";
            login((ArrayList<String>) read(doctors));
             System.out.println("Menu:");
            System.out.println("1. Reversed hours.");
            System.out.println("2. Sort reversed hours");
            int selectionFromTheMainMenu = Integer.parseInt(scanner.nextLine());
            if (selectionFromTheMainMenu == 1) {

            } else if (selectionFromTheMainMenu == 2) {
                System.out.println("Select an option from the following menu");
                System.out.println("1. Sort by patient name in ascending order");
                System.out.println("2. Sort by patient name in descending order");
                System.out.println("3. Sorting by appointment for examination of patients in ascending order");
                System.out.println("4. Sorting by appointment for examination of patients in descending order");
                System.out.println("5. Sorting by patients ID");
                int selectionFromSortReversedHours = Integer.parseInt(scanner.nextLine());
                if (selectionFromSortReversedHours == 1) {
                } else if (selectionFromSortReversedHours == 2) {
                } else if (selectionFromSortReversedHours == 3) {
                }else if (selectionFromSortReversedHours == 4) {
                }else if (selectionFromSortReversedHours == 5) {
                }
            }
        } else if (choice == 2) {
            String patients = "D:\\DigitalMontana\\Hospital-master\\src\\com\\company\\patients.csv";
            login((ArrayList<String>) read(patients));
        }
    }

    public static void login(ArrayList<String> userList) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user_ID");
        String userId = scanner.nextLine();
        System.out.println("Please enter your first name");
        String name = scanner.nextLine();
        System.out.println("Please enter your second name");
        String secondName = scanner.nextLine();
        boolean isContain = false;
        for (String element : userList) {
            if (element.contains(name) && (element.contains(secondName)) && (element.contains(userId))) {
                System.out.printf("Welcome, %s %s!", name, secondName);
                System.out.println();
                isContain = true;
                break;
            }
        }
        if (!isContain) {
            System.out.println("Wrong ID or Name. Please enter again!");
            login(userList);
        }
    }
}

