package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Login {
    public static void loginForDoctors(ArrayList<User> userList, String userId, String name,
                                       String secondName) throws IOException {
        boolean isContain = false;
        List<String> strings = userList.stream()
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());
        for (String user : strings) {
            if (user.contains(name) && user.contains(secondName) && (user.contains(userId))) {
                System.out.printf("Please select from the specified doctors menu, %s %s!", name, secondName);
                System.out.println();
                isContain = true;
                break;
            }
        }
        if (!isContain) {
            System.out.println("Wrong ID or Name. Please enter again!");
            loginDoctor();
        }
    }

    public static void loginForPatients(ArrayList<User> userList, String userId, String name,
                                        String secondName) throws IOException {
        boolean isContain = false;
        List<String> strings = userList.stream()
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());
        for (String user : strings) {
            if (user.contains(name) && user.contains(secondName) && (user.contains(userId))) {
                System.out.printf("Please select from the specified patient menu, %s %s!", name, secondName);
                System.out.println();
                isContain = true;
                break;
            }
        }
        if (!isContain) {
            System.out.println("Wrong ID or Name. Please enter again!");
            loginPatient();
        }
    }
    public static void loginPatient() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user_ID");
        String userId = scanner.next();
        System.out.println("Please enter your first name");
        String name = scanner.next();
        System.out.println("Please enter your second name");
        String secondName = scanner.next();
        PatientOptions.patientsOptions(userId, name, secondName);
    }

    public static void loginDoctor() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user ID");
        String userId = scanner.next();
        System.out.println("Please enter your first name");
        String name = scanner.next();
        System.out.println("Please enter your second name");
        String secondName = scanner.next();
        DoctorOptions.doctorsOptions(userId, name, secondName);
    }
}
