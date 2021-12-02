
package com.company;

import java.util.ArrayList;

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
    }public static void groupByDate(ArrayList<Appointment> appointments) {
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
}
