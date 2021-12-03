package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GroupPatients {
    public static void groupByNameDoctors(ArrayList<Appointment> appointments) {
        System.out.println("Information on the number of recorded hours by name of a doctor");
        for (int i = 0; i < appointments.size(); i++) {
            int sumDublicate = 0;
            for (int j = 0; j < appointments.size(); j++) {
                if (appointments.get(i).getDoctor().getSecondName().equals(appointments.get(j).getDoctor().getSecondName())) {
                    if (j < i) {
                        break;
                    }
                    sumDublicate++;
                }
            }
            if (sumDublicate > 0) {
                System.out.println("Doctor : " + appointments.get(i).getDoctor().getSecondName() + " - "
                        + sumDublicate);

            }
        }
    }

    public static void groupByHospitalWard(ArrayList<Appointment> appointments) {
        System.out.println("Information on the number of recorded hours by hospital ward:");
        for (int i = 0; i < appointments.size(); i++) {
            int sumDublicate = 0;
            for (int j = 0; j < appointments.size(); j++) {
                if (appointments.get(i).getDoctor().getSpeciality().equals(appointments.get(j).getDoctor().getSpeciality())) {
                    if (j < i) {
                        break;
                    }
                    sumDublicate++;
                }
            }
            if (sumDublicate > 0) {
                System.out.println(appointments.get(i).getDoctor().getSpeciality() + " - "
                        + sumDublicate);

            }
        }
    }

    public static void groupByDate(ArrayList<Appointment> appointments) {
        System.out.println("Information on the number of recorded hours by date:");
        for (int i = 0; i < appointments.size(); i++) {
            int sumDuplicates = 0;
            for (int j = 0; j < appointments.size(); j++) {
                if (appointments.get(i).getDate().equals(appointments.get(j).getDate())) {
                    if (j < i) {
                        break;
                    }
                    sumDuplicates++;
                }
            }
            if (sumDuplicates > 0) {
                System.out.println(appointments.get(i).getDate() + " - "
                        + sumDuplicates);

            }
        }
    }

    public static void groupingOfPatients(String userId, String name, String secondName,
                                          ArrayList<Appointment> appointments, ArrayList<User> doctors) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("1. Sort by doctors name");
            System.out.println("2. Sort by hospital ward");
            System.out.println("3. Sorting by date of visit");
            int selectionFromSortReversedHours = Integer.parseInt(scanner.nextLine());
            if (selectionFromSortReversedHours == 1) {
                groupByNameDoctors(appointments);
                System.out.println();
                DoctorOptions.backToDoctorsMenu(userId, name, secondName);
            } else if (selectionFromSortReversedHours == 2) {
                groupByHospitalWard(appointments);
                System.out.println();
                DoctorOptions.backToDoctorsMenu(userId, name, secondName);
            } else if (selectionFromSortReversedHours == 3) {
                groupByDate(appointments);
                System.out.println();
                DoctorOptions.backToDoctorsMenu(userId, name, secondName);
            } else {
                System.out.println("Wrong input!Try again!");
                groupingOfPatients(userId, name, secondName, appointments, doctors);
            }
        } catch (Exception e) {
            System.out.println("Wrong input!Try again!");
            groupingOfPatients(userId, name, secondName, appointments, doctors);
        }
    }
}
