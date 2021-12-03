package com.company;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to online system Hospital");
        startMenu();
    }

    public static void startMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hospital Мain Мenu:");
        System.out.println("For doctors, press 1.");
        System.out.println("For patients, press 2.");
        try {
            int choice = scanner.nextInt();
            if (choice == 1) {
                Login.loginDoctor();
            } else if (choice == 2) {
                Login.loginPatient();
            } else {
                System.out.println("Wrong input!Try again!");
                startMenu();
            }
        } catch (Exception e) {
            System.out.println("Wrong input! Try again!");
            startMenu();
        }
    }
}
