package com.company;

import java.util.*;

public class Doctor extends User {

    private HospitalSpecialties speciality;

    public HospitalSpecialties getSpeciality() {
        return speciality;
    }

    public void setSpeciality(HospitalSpecialties speciality) {

        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + super.getId() +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                "speciality=" + speciality +
                '}';
    }

    public Doctor(int id, String firstName, String secondName, HospitalSpecialties speciality) {
        super(id, firstName, secondName);
        this.speciality = speciality;

    }


    public static ArrayList<Appointment> reversedHours(ArrayList<Appointment> appointments, String userId) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Appointment> reversedHoursForDoctor = new ArrayList<>();
        System.out.println("For reference saved doctor's custom hours, press 1");
        System.out.println("For reference by id entered the system, press 2");
        int choiceIdDoctor = Integer.parseInt(scanner.nextLine());

        if (choiceIdDoctor == 1) {
            System.out.println("Choice Id Doctor");
            int idReversedHours = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < appointments.size(); i++) {
                if (Objects.equals(appointments.get(i).getDoctorID(), idReversedHours)) {
                    reversedHoursForDoctor.add(appointments.get(i));
                }
            }
        } else if (choiceIdDoctor == 2) {
            int idReversedHours = Integer.parseInt(userId);
            for (int i = 0; i < appointments.size(); i++) {
                if (Objects.equals(appointments.get(i).getDoctorID(), idReversedHours)) {
                    reversedHoursForDoctor.add(appointments.get(i));
                }
            }
        } else {
            int idReversedHours = Integer.parseInt(userId);
            for (int i = 0; i < appointments.size(); i++) {
                if (Objects.equals(appointments.get(i).getDoctorID(), idReversedHours)) {
                    reversedHoursForDoctor.add(appointments.get(i));
                }
            }
        }
        return reversedHoursForDoctor;
    }

    public static void sortByPatientNameInAscendingOrder(ArrayList<Appointment> appointments, ArrayList<User> patients) {
        ArrayList<User> reversedHoursForDoctorwithNamePatient = new ArrayList<>();
        for (int i = 0; i < patients.size(); i++) {
            for (int j = 0; j < appointments.size(); j++) {
                if (patients.get(0).equals(appointments.get(1))) {
                    reversedHoursForDoctorwithNamePatient.add(6, patients.get(1));
                    reversedHoursForDoctorwithNamePatient.add(7, patients.get(2));
                }

            }
        }
        System.out.println(reversedHoursForDoctorwithNamePatient);


    }

    public static void SortingByAppointmentForExaminationOfPatientsInAscendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToDate);
        System.out.println(reversedHoursForDoctor);
    }

    public static void SortingByAppointmentForExaminationOfPatientsInDescendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToDateDescending);
        System.out.println(reversedHoursForDoctor);
    }

    public static void SortingByPatientsIdInAscendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToPatientId);
        System.out.println(reversedHoursForDoctor);
    }

    public static void SortingByPatientsIdInDescendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToPatientIdDescending);
        System.out.println(reversedHoursForDoctor);

    }
}