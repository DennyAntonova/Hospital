package com.company;

public class Appointment {
    private int appointmentID;
    private Date date;
    private int patientID;
    private int doctorID;
    private String time;
    Examination examination;

    public Appointment(int appointment_id,Date date,int patientID,int doctorID,String time,Examination examination){
    this.appointmentID=appointment_id;
    this.date=date;
    this.patientID=patientID;
    this.doctorID=doctorID;
    this.time=time;
    this.examination=examination;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Examination getExamination() {
        return examination;
    }

    public void setExamination(Examination examination) {
        this.examination = examination;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentID=" + appointmentID +
                ", date=" + date +
                ", patientID=" + patientID +
                ", doctorID=" + doctorID +
                ", time='" + time + '\'' +
                ", examination=" + examination +
                '}';
    }
}
