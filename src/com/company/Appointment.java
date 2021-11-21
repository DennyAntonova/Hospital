package com.company;

import java.time.format.DateTimeFormatter;

public class Appointment {

    private int appointmentId;
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

    public DateTimeFormatter getDate() {
        return date;
    }

    public Object setDate(String date) {
        this.date = DateTimeFormatter.ofPattern(date);
        return null;
    }

    public DateTimeFormatter getTime() {
        return time;
    }

    public Object setTime(String time) {
        this.time = DateTimeFormatter.ofPattern(time);
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
                ", date=" + date +
                ", time=" + time +
                ", doctorID=" + doctorID +

                '}';
    }
}

