
package com.company;

import java.util.ArrayList;

public class SortingReversedHoursForDoctor {
    public static void sortByPatientNameInAscendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareByNamePatient);
        System.out.println(reversedHoursForDoctor);

    }
    public static void sortByPatientNameInDescendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareByNamePatientDescending);
        System.out.println(reversedHoursForDoctor);


    }

    public static void SortingByAppointmentForExaminationOfPatientsInAscendingOrder
            (ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToDate);
        System.out.println(reversedHoursForDoctor);
    }

    public static void SortingByAppointmentForExaminationOfPatientsInDescendingOrder
            (ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToDateDescending);
        System.out.println(reversedHoursForDoctor);
    }

    public static void SortingByPatientsIdInAscendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareTo);
        System.out.println(reversedHoursForDoctor);
    }
    public static void SortingByPatientsIdInDescendingOrder(ArrayList<Appointment> reversedHoursForDoctor) {
        reversedHoursForDoctor.sort(Appointment::compareToPatientIdDescending);
        System.out.println(reversedHoursForDoctor);

    }
}

