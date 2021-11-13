package com.company;

public class Patient {
    private static int next_patient_id = 1;
    private int patient_id;
    private String first_name;
    private String last_name;
    private int age;

    public Patient(int patient_id, String first_name, String last_name, int age) {
        patient_id = next_patient_id++;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patient_id='" + patient_id + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
