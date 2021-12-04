
package com.company;

import java.util.ArrayList;

public class SortingReversedHoursForDoctor {
    public static ArrayList<Appointment> sortByPatientNameInAscendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareByNamePatient);
        System.out.println(reversedHoursForDoctor);
        return reversedHoursForDoctor;
    }

    public static ArrayList<Appointment> sortByPatientNameInDescendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareByNamePatientDescending);
        System.out.println(reversedHoursForDoctor);
        return reversedHoursForDoctor;

    }

    public static ArrayList<Appointment> sortingByAppointmentForExaminationOfPatientsInAscendingOrder
            (ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToDate);
        System.out.println(reversedHoursForDoctor);
        return reversedHoursForDoctor;
    }

    public static ArrayList<Appointment> sortingByAppointmentForExaminationOfPatientsInDescendingOrder
            (ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToDateDescending);
        System.out.println(reversedHoursForDoctor);
        return reversedHoursForDoctor;
    }

    public static ArrayList<Appointment> sortingByPatientsIdInAscendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareTo);
        System.out.println(reversedHoursForDoctor);
        return reversedHoursForDoctor;
    }

    public static ArrayList<Appointment> sortingByPatientsIdInDescendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToPatientIdDescending);
        System.out.println(reversedHoursForDoctor);
        return reversedHoursForDoctor;
    }
}

