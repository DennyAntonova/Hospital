package com.company;

import java.util.*;

public class Patient extends User {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Patient(int id, String firstName, String secondName, int age) {
        super(id, firstName, secondName);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + super.getId() +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + age +
                '}';
    }

    public static void reversedHours(ArrayList<Appointment> appointments, String userId) {
        int idReversedHours = Integer.parseInt(userId);
        for (int i = 0; i < appointments.size(); i++) {
            if (Objects.equals(appointments.get(i).getPatientID(), idReversedHours)) {
                System.out.println(appointments.get(i));
            }
        }
    }

    public static void cancelAppointment(ArrayList<Appointment> appointments) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose appointment id : ");
        int appointmentId = scanner.nextInt();
        for (int i = 0; i < appointments.size(); i++) {
            if (Objects.equals(appointments.get(i).getAppointmentId(), appointmentId)) {
                System.out.println(appointments.remove(i));
                System.out.println("You have successfully canceled your appointment! ");
            }
        }
    }
}
