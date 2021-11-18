package com.company;

public class Patient extends User{
  private int age;

    public Patient(int id, String firstName, String secondName, int age) {
        super(id,firstName,secondName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + super.getId() +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                "age=" + age +
                '}';
    }
}

   
