package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Doctor.*;
import static com.company.Doctor.reversedHours;
import static com.company.ReadFile.*;
import static com.company.ReadFile.readAppointmentsFromCSV;
import static com.company.User.login;

public class Hospital {
    public static void startMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For doctors, press 1.");
        System.out.println("For patients, press 2.");
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter user_ID");
        String userId = scanner.nextLine();
        System.out.println("Please enter your first name");
        String name = scanner.nextLine();
        System.out.println("Please enter your second name");
        String secondName = scanner.nextLine();
        if (choice == 1) {
            Hospital.doctorsOptions(userId, name, secondName);
        } else if (choice == 2) {
            Hospital.patientsOptions(userId, name, secondName);
        } else {
            throw new ArithmeticException("Error");
        }
    }
    public static void backToPatientsMenu(String userId, String name, String secondName) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to go back to patients menu, PRESS 1: ");
        System.out.println("If you want to go back to main menu, PRESS 2: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            patientsOptions(userId, name, secondName);
        }
        if (choice == 2) {
            startMenu();
        }
    }

    public static void backToDoctorsMenu(String userId, String name, String secondName) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to go back to doctors menu, PRESS 1: ");
        System.out.println("If you want to go back to main menu, PRESS 2: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            doctorsOptions(userId, name, secondName);
        }
        if (choice == 2) {
            startMenu();
        }
    }

    public static void patientsOptions(String userId, String name, String secondName) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Appointment> appointments = readAppointmentsFromCSV("appointments");
        ArrayList<User> patients = readPatientsFromCSV("patients");
        login(patients, userId, name, secondName);
        System.out.println("Menu:");
        System.out.println("1. Reversed hours.");
        System.out.println("2. Change date / time of an appointment.");
        System.out.println("3. Cancellation of an appointment.");
        int selectionFromTheMainMenu = Integer.parseInt(scanner.nextLine());
        if (selectionFromTheMainMenu == 1) {
            Patient.reversedHours(appointments, userId);
            backToPatientsMenu(userId, name, secondName);
        } else if (selectionFromTheMainMenu == 2) {
            System.out.println("To change the time press 1: ");
            System.out.println("To change the date press 2: ");
            int changeDateOrTime = Integer.parseInt(scanner.nextLine());
            if (changeDateOrTime == 1) {
                Patient.changeTime(appointments);
                backToPatientsMenu(userId, name, secondName);
            }
            if (changeDateOrTime == 2) {
                Patient.changeDate(appointments);
                backToPatientsMenu(userId, name, secondName);
            }
        } else if (selectionFromTheMainMenu == 3) {
            Patient.cancelAppointment(appointments);
            backToPatientsMenu(userId, name, secondName);
        }
    }

    public static void doctorsOptions(String userId, String name, String secondName) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> doctors = readDoctorsFromCSV("doctors");
        ArrayList<Appointment> appointments = readAppointmentsFromCSV("appointments");
        login(doctors, userId, name, secondName);
        System.out.println("Menu:");
        System.out.println("1. Reversed hours.");
        System.out.println("2. Sort reversed hours");
        int selectionFromTheMainMenu = Integer.parseInt(scanner.nextLine());
        if (selectionFromTheMainMenu == 1) {
            System.out.println(reversedHours(appointments, userId));
            backToDoctorsMenu(userId, name, secondName);
        } else if (selectionFromTheMainMenu == 2) {
            System.out.println("Select an option from the following menu");
            System.out.println("1. Sort by patient name in ascending order");
            System.out.println("2. Sort by patient name in descending order");
            System.out.println("3. Sorting by appointment for examination of patients in ascending order");
            System.out.println("4. Sorting by appointment for examination of patients in descending order");
            System.out.println("5. Sorting by patients ID in ascending order ");
            System.out.println("6. Sorting by patients ID in descending order ");
            int selectionFromSortReversedHours = Integer.parseInt(scanner.nextLine());
            if (selectionFromSortReversedHours == 1) {
                backToDoctorsMenu(userId, name, secondName);
            } else if (selectionFromSortReversedHours == 2) {
                backToDoctorsMenu(userId, name, secondName);
            } else if (selectionFromSortReversedHours == 3) {
                SortingByAppointmentForExaminationOfPatientsInAscendingOrder(reversedHours(appointments, userId));
                backToDoctorsMenu(userId, name, secondName);
            } else if (selectionFromSortReversedHours == 4) {
                SortingByAppointmentForExaminationOfPatientsInDescendingOrder(reversedHours(appointments, userId));
                backToDoctorsMenu(userId, name, secondName);
            } else if (selectionFromSortReversedHours == 5) {
                SortingByPatientsIdInAscendingOrder(reversedHours(appointments, userId));
                backToDoctorsMenu(userId, name, secondName);
            } else if (selectionFromSortReversedHours == 6) {
                SortingByPatientsIdInDescendingOrder(reversedHours(appointments, userId));
                backToDoctorsMenu(userId, name, secondName);
            }
        }
    }
}
