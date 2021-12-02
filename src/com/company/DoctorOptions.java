package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Doctor.reversedHours;
import static com.company.ReadFile.*;
import static com.company.SortingReversedHoursForDoctor.*;
import static com.company.SortingReversedHoursForDoctor.SortingByPatientsIdInDescendingOrder;

public class DoctorOptions {
    public static void doctorsOptions(String userId, String name, String secondName) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> doctors = readDoctorsFromCSV("doctors");
        ArrayList<Appointment> appointments = readAppointmentsFromCSV("appointments");
        ArrayList<User> patients = readPatientsFromCSV("patients");

        Login.loginForDoctors(doctors, userId, name, secondName);
        try {
            System.out.println("Main Menu:");
            System.out.println("1. Reversed hours.");
            System.out.println("2. Sort reversed hours for doctor");
            System.out.println(("3. Sort all reversed hours"));
            int selectionFromTheMainMenu = Integer.parseInt(scanner.nextLine());
            if (selectionFromTheMainMenu == 1) {
                System.out.println(reversedHours(appointments, userId));
                backToDoctorsMenu(userId, name, secondName);
            } else if (selectionFromTheMainMenu == 2) {
                sortDoctorsAppointments(userId, name, secondName, appointments);
            } else if (selectionFromTheMainMenu == 3) {
                GroupPatients.groupingOfPatients(userId, name, secondName, appointments, doctors);
            } else {
                System.out.println("Wrong input!Try again!");
                doctorsOptions(userId, name, secondName);
            }
        } catch (Exception e) {
            System.out.println("Wrong input!Try again!");
            doctorsOptions(userId, name, secondName);
        }
    }

    public static void sortDoctorsAppointments(String userId, String name, String secondName,
                                               ArrayList<Appointment> appointments) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Select an option from the following menu");
            System.out.println("1. Sort by patient name in ascending order");
            System.out.println("2. Sort by patient name in descending order");
            System.out.println("3. Sorting by appointment for examination of patients in ascending order");
            System.out.println("4. Sorting by appointment for examination of patients in descending order");
            System.out.println("5. Sorting by patients ID in ascending order ");
            System.out.println("6. Sorting by patients ID in descending order ");
            int selectionFromSortReversedHours = Integer.parseInt(scanner.nextLine());
            if (selectionFromSortReversedHours == 1) {
                sortByPatientNameInAscendingOrder(reversedHours(appointments, userId));
                backToDoctorsMenu(userId, name, secondName);
            } else if (selectionFromSortReversedHours == 2) {
                sortByPatientNameInDescendingOrder(reversedHours(appointments, userId));
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
            } else {
                System.out.println("Wrong input!Try again!");
                sortDoctorsAppointments(userId, name, secondName, appointments);
            }
        } catch (Exception e) {
            System.out.println("Wrong input!Try again!");
            sortDoctorsAppointments(userId, name, secondName, appointments);
        }
    }

    public static void backToDoctorsMenu(String userId, String name, String secondName) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to go back to doctors menu, PRESS 1: ");
        System.out.println("If you want to go back to main menu, PRESS 2: ");
        try {
            int choice = scanner.nextInt();
            if (choice == 1) {
                DoctorOptions.doctorsOptions(userId, name, secondName);
            } else if (choice == 2) {
                Main.startMenu();
            }
        } catch (Exception e) {
            System.out.println("Wrong input! Try again! ");
            DoctorOptions.doctorsOptions(userId, name, secondName);
        }
    }


}
