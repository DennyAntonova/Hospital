package com.company;

public class Patient {
       private String patient_id;
    private String first_name;
    private String last_name;
    private String age;

    public Patient(String patient_id, String first_name, String last_name, String age) {
        this.patient_id = patient_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAge() {
        return age;
    }


    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    public void setAge(String age) {
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
