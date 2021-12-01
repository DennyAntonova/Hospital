package com.company;

import java.util.ArrayList;
import java.util.Map;


import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Appointment<T> implements Comparable<Appointment> {

    private final int appointmentId;
    private Patient patient;
    private TypeOfExaminations examination;
    private String date;
    private String time;
    private Doctor doctor;

    public int getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public TypeOfExaminations getExamination() {
        return examination;
    }

    public void setExamination(TypeOfExaminations examination) {
        this.examination = examination;
    }

    public String getDate() {
        String newDate = String.valueOf(date);
        return newDate;
    }

    public Object setDate(String date) {
        this.date = date;
        return null;
    }

    public String getTime() {
        return time;
    }

    public Object setTime(String time) {
        this.time = time;
        return null;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Appointment(int appointmentID, Patient patient, TypeOfExaminations examination,
                       String date, String time, Doctor doctor) {
        this.appointmentId = appointmentID;
        this.patient = patient;
        this.examination = examination;
        this.date = date;
        this.time = time;
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentId +
                ", patient=" + patient +
                ", examination=" + examination +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", doctor=" + doctor +
                '}';
    }
     public String toString2() {
        return "" + appointmentId +
                "," + getPatient().getId() +
                "," + examination +
                "," + getDate() +
                "," + getTime() +
                "," + getPatient().getId();
    }
    @Override
    public int compareTo(Appointment o) {
        if (this.appointmentId != o.getAppointmentId()) {
        }
        return this.appointmentId - o.getAppointmentId();
    }

//    public int compareToPatientId(Appointment o) {
//        if (this.patientID != o.getPatientID()) {
//        }
//        return this.patientID - o.getPatientID().getId());
//    }
//
//    public int compareToPatientIdDescending(Appointment o) {
//        if (this.patientID != o.getPatientID()) {
//        }
//        return o.getPatientID().getId() - this.patientID;
//    }

    public static int compareToDate(Appointment o1, Appointment o2) {
        String x1 = String.valueOf(o1.getDate());
        String x2 = String.valueOf(o2.getDate());
        int compareDateAndTime = x1.compareTo(x2);
        if (compareDateAndTime != 0) {
            return compareDateAndTime;
        }
        String x3 = String.valueOf(o1.getTime());
        String x4 = String.valueOf(o2.getTime());
        compareDateAndTime = x3.compareTo(x4);

        return compareDateAndTime;
    }

    public static int compareToDateDescending(Appointment o1, Appointment o2) {
        String x1 = String.valueOf(o1.getDate());
        String x2 = String.valueOf(o2.getDate());
        int compareDateAndTime = x2.compareTo(x1);
        if (compareDateAndTime != 0) {
            return compareDateAndTime;
        }
        String x3 = String.valueOf(o1.getTime());
        String x4 = String.valueOf(o2.getTime());
        compareDateAndTime = x4.compareTo(x3);

        return compareDateAndTime;
    }

//    public static void sortByName(ArrayList<Appointment> appointments, ArrayList<User> doctors) {
//        Map<Integer, Long> counting = appointments.stream().collect(
//                groupingBy(Appointment::getDoctorID, counting()));
//        int countOfDoctors = 0;
//        for (int i = 0; i < doctors.size(); i++) {
//            if (counting.containsKey(doctors.get(i).getId())) {
//                countOfDoctors = Math.toIntExact(counting.get(doctors.get(i).getId()));
//                System.out.println("Doctor " + doctors.get(i).getSecondName() + " - " + countOfDoctors);
//            }
//        }
//    }

    public static void sortByDate(ArrayList<Appointment> appointments) {
        Map<String, Long> count = appointments.stream().collect(
                groupingBy(Appointment::getDate, counting()));
        System.out.println(count.toString().replaceAll("''", ""));
    }

}
