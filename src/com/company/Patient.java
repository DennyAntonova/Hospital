package com.company;

public class Patient extends User{
 private int age;

    public Patient(int userID, String firstName, String secondName, int age) throws FileNotFoundException {
        super(userID,firstName,secondName);
        this.age = age;
    }

    @Override
    public int getUserID() {
        return super.getUserID();
    }

    @Override
    public void setUserID(int userID) {
        super.setUserID(userID);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getSecondName() {
        return super.getSecondName();
    }

    @Override
    public void setSecondName(String secondName) {
        super.setLastName(secondName);
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
                "age=" + age +
                '}';
    }
}

   
