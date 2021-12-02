package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadFile {

    ArrayList<User> doctors = readDoctorsFromCSV("doctors");
    ArrayList<Appointment> appointments = readAppointmentsFromCSV("appointments");
    ArrayList<User> patients = readPatientsFromCSV("patients");

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
        HospitalSpecialties specialties = HospitalSpecialties.valueOf(metadata[3].toUpperCase());
        return new Doctor(id, firstName, secondName, specialties);
    }

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
        ArrayList<User> doctors = readDoctorsFromCSV("doctors");
        ArrayList<User> patients = readPatientsFromCSV("patients");

        ArrayList<Appointment> appointments = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                Appointment appointment = createAppointment(attributes, doctors,
                        patients);
                appointments.add(appointment);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return appointments;
    }


    public static Appointment createAppointment(String[] metadata, ArrayList<User> doctors, ArrayList<User> patients) {
        int idAppointment = Integer.parseInt(metadata[0]);
        int idPatient = Integer.parseInt(metadata[1]);
        Patient patient = (Patient) findPatientById(patients, idPatient);
        TypeOfExaminations typeOfExamination = TypeOfExaminations.valueOf(metadata[2].toUpperCase());
        String date = metadata[3];
        String time = metadata[4];
        int idDoctor = Integer.parseInt(metadata[5]);
        Doctor doctor = findDoctorById(doctors, idDoctor);
        return new Appointment(idAppointment, patient, typeOfExamination, date, time, doctor);

    }

    public static Patient findPatientById(ArrayList<User> patients, int idPatient) {
        for (int i = 0; i <patients.size() ; i++) {
            if(idPatient == patients.get(i).getId()){
                return (Patient) patients.get(i);
            }
        }
        return null;
    }

    public static Doctor findDoctorById(ArrayList<User> doctors, int idDoctor) {
        for (int i = 0; i <doctors.size() ; i++) {
            if(idDoctor == doctors.get(i).getId()){
                return (Doctor) doctors.get(i);
            }
        }
        return null;
    }
}