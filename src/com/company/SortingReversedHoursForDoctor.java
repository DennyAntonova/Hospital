
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

    public static ArrayList<Appointment> SortingByAppointmentForExaminationOfPatientsInAscendingOrder
            (ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToDate);
        System.out.println(reversedHoursForDoctor);
        return reversedHoursForDoctor;
    }

    public static ArrayList<Appointment> SortingByAppointmentForExaminationOfPatientsInDescendingOrder
            (ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToDateDescending);
        System.out.println(reversedHoursForDoctor);
        return reversedHoursForDoctor;
    }

    public static ArrayList<Appointment> SortingByPatientsIdInAscendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareTo);
        System.out.println(reversedHoursForDoctor);
        return reversedHoursForDoctor;
    }

    public static ArrayList<Appointment> SortingByPatientsIdInDescendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToPatientIdDescending);
        System.out.println(reversedHoursForDoctor);
        return reversedHoursForDoctor;
    }
}

