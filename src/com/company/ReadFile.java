package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class ReadFile {
    public static ArrayList<User> readDoctorsFromCSV(String fileName) {
        ArrayList<User> doctors = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                User doctor = createDoctor(attributes);
                doctors.add(doctor);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return doctors;
    }

    public static User createDoctor(String[] metadata) {
        int id = Integer.parseInt(metadata[0]);
        String firstName = metadata[1];
        String secondName = metadata[2];
        String specialties = metadata[3];
        return new Doctor(id, firstName, secondName, specialties);
    }

    ArrayList<User> doctors = readDoctorsFromCSV("D:\\CheckHomework\\Hospital-master\\src\\com\\company\\doctors");

    public static ArrayList<User> readPatientsFromCSV(String fileName) {
        ArrayList<User> patients = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                User patient = createPatient(attributes);
                patients.add(patient);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return patients;
    }

    public static User createPatient(String[] metadata) {
        int id = Integer.parseInt(metadata[0]);
        String firstName = metadata[1];
        String secondName = metadata[2];
        int age = Integer.parseInt(metadata[3]);
        return new Patient(id, firstName, secondName, age);
    }

    public static ArrayList<Appointment> readAppointmentsFromCSV(String fileName) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                Appointment appointment = createAppointments(attributes);
                appointments.add(appointment);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return appointments;
    }

    public static Appointment createAppointments(String[] metadata) {
        int idAppointment = Integer.parseInt(metadata[0]);
        int idPatient = Integer.parseInt(metadata[1]);
        TypeOfExaminations typeOfExamination = TypeOfExaminations.valueOf(toUpperCase(metadata[2]));
        DateTimeFormatter date = DateTimeFormatter.ofPattern(metadata[3]);
        DateTimeFormatter time = DateTimeFormatter.ofPattern(metadata[4]);
        int idDoctor = Integer.parseInt(metadata[5]);
        return new Appointment(idAppointment, idPatient, typeOfExamination, date, time, idDoctor);
    }
}
