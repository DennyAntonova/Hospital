package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.company.ReadFile.readAppointmentsFromCSV;
import static com.company.ReadFile.readPatientsFromCSV;

public class PatientOptions {
    public static void patientsOptions(String userId, String name, String secondName) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Appointment> appointments = readAppointmentsFromCSV("appointments");
        ArrayList<User> patients = readPatientsFromCSV("patients");
        Login.loginForPatients(patients, userId, name, secondName);
        try {
            System.out.println("Main Menu:");
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
            } else {
                System.out.println("Wrong input!Try again!");
                patientsOptions(userId, name, secondName);
            }
        } catch (Exception e) {
            System.out.println("Wrong input!Try again!");
            patientsOptions(userId, name, secondName);
        }
    }

    public static void backToPatientsMenu(String userId, String name, String secondName) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to go back to patients menu, PRESS 1: ");
        System.out.println("If you want to go back to main menu, PRESS 2: ");
        try {
            int choice = scanner.nextInt();
            if (choice == 1) {
                PatientOptions.patientsOptions(userId, name, secondName);
            }
            if (choice == 2) {
                Main.startMenu();
            }
        } catch (Exception e) {
            System.out.println("Wrong input! Try again! ");
            PatientOptions.patientsOptions(userId, name, secondName);
        }
    }


}
