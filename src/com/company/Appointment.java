package com.company;
import java.time.format.DateTimeFormatter;


public class Appointment {

    private int appointment_id;
    private final int patient_id;
    String examination;
    private DateTimeFormatter date;
    private DateTimeFormatter time;
    private final int idDoctor;


    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public DateTimeFormatter getDate() {
        return date;
    }

    public void setDate(DateTimeFormatter date) {
        this.date = date;
    }

    public DateTimeFormatter getTime() {
        return time;
    }

    public void setTime(DateTimeFormatter time) {
        this.time = time;
    }

    public String getExamination() {
        return examination;
    }

    public void setExamination(String examination) {
        this.examination = examination;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public Appointment(int appointment_id, int patient_id, String examination, DateTimeFormatter date, DateTimeFormatter time, int idDoctor) {
        this.appointment_id = appointment_id;
        this.patient_id = patient_id;
        this.examination = examination;
        this.date = date;
        this.time = time;
        this.idDoctor = idDoctor;
    }


    @Override
    public String toString() {
        return "Appointment{" +
                "appointment_id=" + appointment_id +
                ", date='" + date + '\'' +
                ", patient_id=" + patient_id +
                ", doctor_id=" + idDoctor +
                ", time='" + time + '\'' +
                ", examination='" + examination + '\'' +
                '}';
    }
}

