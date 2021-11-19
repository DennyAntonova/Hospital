package com.company;

import java.util.*;

public class Doctor extends User {

    private HospitalSpecialties speciality;

    public HospitalSpecialties getSpeciality() {
        return speciality;
    }

    public void setSpeciality(HospitalSpecialties speciality) {

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

    public Doctor(int id, String firstName, String secondName, HospitalSpecialties speciality) {
        super(id, firstName, secondName);
        this.speciality = speciality;

    }

    public static String userId() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void reversedHours(ArrayList<Appointment> appointments) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For reference saved doctor's custom hours, press 1");
        System.out.println("For reference by id entered the system, press 2");
        int choiceIdDoctor = Integer.parseInt(scanner.nextLine());

        if (choiceIdDoctor == 1) {
            System.out.println("Choice Id Doctor");
            int idReversedHours = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < appointments.size(); i++) {
                if (Objects.equals(appointments.get(i).getDoctorID(), idReversedHours)) {
                    System.out.println(appointments.get(i));
//                    ArrayList<Appointment> reversedHourForDoctor = new ArrayList<>();
//                    reversedHourForDoctor.add(appointments.get(i));
//                    System.out.println(reversedHourForDoctor);
//                    for (int j = 0; j < reversedHourForDoctor.size(); j++) {
//                      //  Arrays.sort(reversedHourForDoctor, new Doctor());
//                        System.out.println(Arrays.toString(new ArrayList[]{reversedHourForDoctor}));

                }

            }

        } else if (choiceIdDoctor == 2) {
            int idReversedHours = Integer.parseInt(userId());
            for (int i = 0; i < appointments.size(); i++) {
                if (Objects.equals(appointments.get(i).getDoctorID(), idReversedHours)) {
                    System.out.println(appointments.get(i));
                }
            }
        } else {
            String idReversedHours = userId();
            for (int i = 0; i < appointments.size(); i++) {
                if (Objects.equals(appointments.get(i).getDoctorID(), idReversedHours)) {

                }
            }

        }
    } public static void sortByPatientNameInAscendingOrder(ArrayList<Appointment> appointments){

    }
}
