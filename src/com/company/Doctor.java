package com.company;

public class Doctor extends User {

    private HospitalSpecialties speciality;

    public HospitalSpecialties getSpeciality() {
        return speciality;
    }

    public void setSpeciality(HospitalSpecialties speciality) {
        this.speciality = speciality;
    }

    public Doctor(int id, String firstName, String secondName, HospitalSpecialties speciality) {
        super(id, firstName, secondName);
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + super.getId() +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                "speciality=" + speciality +
                '}';
    }
}
