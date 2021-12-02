package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
                "age=" + age +
                ", id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                '}';
    }

    public static void reversedHours(ArrayList<Appointment> appointments, String userId) {
        int idReversedHours = Integer.parseInt(userId);
        for (int i = 0; i < appointments.size(); i++) {
            if (Objects.equals(appointments.get(i).getPatient().getId(), idReversedHours)) {
                System.out.println(appointments.get(i));
            }
        }
    }

    public static void printWriter(ArrayList<Appointment> appointments) throws IOException {
        File file = new File("appointments");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int j = 0; j < appointments.size(); j++) {
            bw.write(appointments.get(j).toString2().toLowerCase(Locale.ROOT));
            bw.newLine();
        }
        bw.close();
        fw.close();
    }

    public static void changeTime(ArrayList<Appointment> appointments) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose appointment id : ");
        int appointmentId = scanner.nextInt();
        System.out.println("Select a new time int format HHMM: ");
        String newTime = scanner.next();
        for (int i = 0; i < appointments.size(); i++) {
            if (Objects.equals(appointments.get(appointmentId - 1).setTime(newTime), appointmentId)) {
                System.out.println(appointments);
            }
            printWriter(appointments);
        }
        System.out.println("You have successfully changed your time!");
    }

    public static void changeDate(ArrayList<Appointment> appointments) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose appointment id : ");
        int appointmentId = scanner.nextInt();
        System.out.println("Select a new date in format DD-MM-YY: ");
        String newDate = scanner.next();
        for (int i = 0; i < appointments.size(); i++) {
            if (Objects.equals(appointments.get(appointmentId - 1).setDate(newDate), appointmentId)) {
                System.out.println(appointments);
            }
            printWriter(appointments);
        }
        System.out.println("you have successfully changed your date!");
    }

    public static void cancelAppointment(ArrayList<Appointment> appointments) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose appointment id : ");
        int appointmentId = scanner.nextInt();
        for (int i = 0; i < appointments.size(); i++) {
            if (Objects.equals(appointments.get(i).getAppointmentId(), appointmentId)) {
                System.out.println(appointments.remove(i));
                System.out.println("You have successfully canceled your appointment! ");
                printWriter(appointments);
            }
        }
    }
}


