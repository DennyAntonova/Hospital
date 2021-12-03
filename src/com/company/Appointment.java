package com.company;


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
        return "-> AppointmentId=%d,%n %s, %nexamination=%s, date='%s', time='%s', %n%s%n".formatted
                (appointmentId, patient, examination, date, time, doctor);
    }

    public String toString2() {
        return "" + appointmentId +
                "," + getPatient().getId() +
                "," + examination +
                "," + getDate() +
                "," + getTime() +
                "," + getPatient().getId();
    }

    public static int compareByNamePatient(Appointment o1, Appointment o2) {

        return o2.getPatient().getSecondName().compareTo(o1.getPatient().getSecondName());
    }

    public static int compareByNamePatientDescending(Appointment o1, Appointment o2) {

        return o1.getPatient().getSecondName().compareTo(o2.getPatient().getSecondName());
    }

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

    @Override
    public int compareTo(Appointment o) {
        if (this.getPatient().getId() != o.getPatient().getId()) {
        }
        return this.getPatient().getId() - o.getPatient().getId();
    }

    public int compareToPatientIdDescending(Appointment o) {
        if (this.getPatient().getId() != o.getPatient().getId()) {
        }
        return o.getPatient().getId() - this.getPatient().getId();
    }
}







