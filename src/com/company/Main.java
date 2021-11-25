package com.company;

import java.util.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static com.company.Doctor.*;
import static com.company.Doctor.reversedHours;
import static com.company.ReadFile.*;
import static com.company.User.login;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to online system Hospital");
        startMenu();

    }

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
            doctorsOptions(userId, name, secondName);
        } else if (choice == 2) {
            patientsOptions(userId, name, secondName);
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
        ArrayList<User> patients = readPatientsFromCSV("patients");

        login(doctors, userId, name, secondName);
        System.out.println("Menu:");
        System.out.println("1. Reversed hours.");
        System.out.println("2. Sort reversed hours for doctor");
        System.out.println(("3. Sort all reversed hours"));
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
                sortByPatientNameInAscendingOrder(reversedHours(appointments, userId), patients);
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
        } else if (selectionFromTheMainMenu == 3) {
            System.out.println("1. Sort by doctors name");
            System.out.println("2. Sort by hospital ward");
            System.out.println("3. Sorting by date of visit");
            int selectionFromSortReversedHours = Integer.parseInt(scanner.nextLine());
            if (selectionFromSortReversedHours == 1) {
                  Map<Integer, Long> counting = appointments.stream().collect(
                            groupingBy(Appointment::getDoctorID, counting()));
                    int countOfDoctors = 0;
                    for (int i = 0; i < doctors.size(); i++) {
                        if (counting.containsKey(doctors.get(i).getId())) {
                            countOfDoctors = Math.toIntExact(counting.get(doctors.get(i).getId()));
                            System.out.println("Doctor " + doctors.get(i).getSecondName() + " - " + countOfDoctors);
                backToDoctorsMenu(userId, name, secondName);
            } else if (selectionFromSortReversedHours == 2) {
                backToDoctorsMenu(userId, name, secondName);
            } else if (selectionFromSortReversedHours == 3) {
                Map<String, Long> counting = appointments.stream().collect(
                        Collectors.groupingBy(Appointment::getDate, Collectors.counting()));
                System.out.print(counting.toString().replaceAll("''", ""));
                backToDoctorsMenu(userId, name, secondName);
            }
        }
    }
}
