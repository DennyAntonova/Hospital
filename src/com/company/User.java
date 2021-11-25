package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.company.Doctor.*;
import static com.company.Doctor.reversedHours;
import static com.company.ReadFile.*;
import static com.company.ReadFile.readAppointmentsFromCSV;


public class User {
    private int id;
    private String firstName;
    private String secondName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public User(int id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public static void login(ArrayList<User> userList, String userId, String name, String secondName) throws IOException {
        boolean isContain = false;
        List<String> strings = userList.stream()
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());
        for (String user : strings) {
            if (user.contains(name) && user.contains(secondName) && (user.contains(userId))) {
                System.out.printf("Welcome, %s %s!", name, secondName);
                System.out.println();
                isContain = true;
                break;
            }
        }
        if (!isContain) {
            System.out.println("Wrong ID or Name. Please enter again!");
            Hospital.startMenu();        }
    }
}