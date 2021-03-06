package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Doctor extends User {

    private HospitalSpecialties speciality;

    public HospitalSpecialties getSpeciality() {
        return speciality;
    }

    public void setSpeciality(HospitalSpecialties speciality) {

        this.speciality = speciality;
    }

    public Doctor(int id, String firstName, String secondName, HospitalSpecialties speciality) {
        super(id, firstName, secondName);
        this.speciality = speciality;

    }

    @Override
    public String toString() {
        return "Doctor{" +
                "speciality=" + speciality +
                ", id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                '}';
    }

    public static ArrayList<Appointment> reversedHours(ArrayList<Appointment> appointments, String userId) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Appointment> reversedHoursForDoctor = new ArrayList<>();
        System.out.println("For reference saved doctor's custom hours, press 1");
        System.out.println("For reference by id entered the system, press 2");
        try {
            int choiceIdDoctor = Integer.parseInt(scanner.nextLine());

            if (choiceIdDoctor == 1) {
                System.out.println("Choice Id Doctor");
                int idReversedHours = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < appointments.size(); i++) {
                    if (Objects.equals(appointments.get(i).getDoctor().getId(), idReversedHours)) {
                        reversedHoursForDoctor.add(appointments.get(i));
                    }
                }
            } else if (choiceIdDoctor == 2) {
                int idReversedHours = Integer.parseInt(userId);
                for (int i = 0; i < appointments.size(); i++) {
                    if (Objects.equals(appointments.get(i).getDoctor().getId(), idReversedHours)) {
                        reversedHoursForDoctor.add(appointments.get(i));
                    }
                }
            } else {
                System.out.println("Wrong input! Try again!");
                reversedHours(appointments, userId);
            }
            return reversedHoursForDoctor;
        } catch (Exception e) {
            System.out.println("Wrong input! Try again!");
        }
        return reversedHoursForDoctor;
    }
}
