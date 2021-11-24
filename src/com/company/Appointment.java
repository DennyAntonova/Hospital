package com.company;

import java.time.format.DateTimeFormatter;

public class Appointment implements Comparable<Appointment> {
  
import static java.time.format.DateTimeFormatter.*;


    private final int appointmentId;
    private int patientID;
    private TypeOfExaminations examination;
    private DateTimeFormatter date;
    private DateTimeFormatter time;
    private int doctorID;

    public int getAppointmentId() {
        return appointmentId;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
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
        this.date = ofPattern(date);
        return null;
    }

    public DateTimeFormatter getTime() {
        return time;
    }

    public Object setTime(String time) {
        this.time = ofPattern(time);
        return null;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public Appointment(int appointmentID, int patientID, TypeOfExaminations examination,
                       DateTimeFormatter date, DateTimeFormatter time, int doctorID) {
        this.appointmentId = appointmentID;
        this.patientID = patientID;
        this.examination = examination;
        this.date = date;
        this.time = time;
        this.doctorID = doctorID;

    }

    @Override
    public String toString() {
        return "Appointment{" +

                "appointmentID=" + appointmentId +
                ", patientID=" + patientID +
                ", examination=" + examination +
                ", date=" + getDate() +
                ", time=" + getTime() +
                ", doctorID=" + doctorID +

                '}';
    }

    @Override
    public int compareTo(Appointment o) {
        if (this.appointmentId != o.getAppointmentId()) {

        }
        return this.appointmentId - o.getAppointmentId();
    }

    public int compareToPatientId(Appointment o) {
        if (this.patientID != o.getPatientID()) {
        }
        return this.patientID - o.getPatientID();
    }

    public int compareToPatientIdDescending(Appointment o) {
        if (this.patientID != o.getPatientID()) {
        }
        return o.getPatientID() - this.patientID;
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
}