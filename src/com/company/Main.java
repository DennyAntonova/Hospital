package com.company;


import java.util.*;

import static com.company.Doctor.reversedHours;
import static com.company.ReadFile.*;
import static com.company.User.login;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> doctors = readDoctorsFromCSV("D:\\CheckHomework\\Hospital-master\\src\\com\\company\\doctors");
        ArrayList<Appointment> appointments = readAppointmentsFromCSV("D:\\CheckHomework\\Hospital-master\\src\\com\\company\\appointments");
        ArrayList<User> patients = readPatientsFromCSV("D:\\CheckHomework\\Hospital-master\\src\\com\\company\\patients");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to online system Hospital");
        System.out.println("For doctors, press 1.");
        System.out.println("For patients, press 2.");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            login(doctors);
            System.out.println("Menu:");
            System.out.println("1. Reversed hours.");
            System.out.println("2. Sort reversed hours");
            int selectionFromTheMainMenu = Integer.parseInt(scanner.nextLine());
            if (selectionFromTheMainMenu == 1) {

                reversedHours(appointments);
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
                } else if (selectionFromSortReversedHours == 4) {
                } else if (selectionFromSortReversedHours == 5) {
                }
            }
        } else if (choice == 2) {

            login(patients);
            System.out.println("Menu:");
            System.out.println("1. Reversed hours.");
            System.out.println("2. Change date / time of an appointment.");
            System.out.println("3. Cancellation of an appointment.");
            int selectionFromTheMainMenu = Integer.parseInt(scanner.nextLine());
            if (selectionFromTheMainMenu == 1) {

            } else if (selectionFromTheMainMenu == 2) {
            } else if (selectionFromTheMainMenu == 3) {
            }
        }
    }
}
