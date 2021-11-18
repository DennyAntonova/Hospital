package com.company;



import java.util.*;

public class Patient extends User {

    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Patient(int id, String firstName, String secondName, int age) {
        super(id, firstName, secondName);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + super.getId() +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + age +
                '}';
    }

    public static String userId() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void reversedHours(ArrayList<Appointment> appointments) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For reference saved patients custom hours, press 1");
        System.out.println("For reference by id entered the system, press 2");
        int choiceIdPatient = Integer.parseInt(scanner.nextLine());

        if (choiceIdPatient == 1) {
            System.out.println("Choice Id Patient");
            int idReversedHours = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < appointments.size(); i++) {
                if (Objects.equals(appointments.get(i).getPatient_id(), idReversedHours)) {
                    System.out.println(appointments.get(i));
                    // ArrayList<Appointment> reversedHourForPatient = new ArrayList<>();
                    //reversedHourForPatient.add(appointments.get(i));
                    //System.out.println(reversedHourForPatient);
                    // for (int j = 0; j < reversedHourForPatient.size(); j++) {
                    //  Arrays.sort(reversedHourForDoctor, new Doctor());
                    //     System.out.println(Arrays.toString(new ArrayList[]{reversedHourForPatient}));

                }

            }
            // }
        } else if (choiceIdPatient == 2) {
            int idReversedHours = Integer.parseInt(userId());
            for (int i = 0; i < appointments.size(); i++) {
                if (Objects.equals(appointments.get(i).getPatient_id(), idReversedHours)) {
                    System.out.println(appointments.get(i));
                }
            }
        } else {
            String idReversedHours = userId();
            for (int i = 0; i < appointments.size(); i++) {
                if (Objects.equals(appointments.get(i).getPatient_id(), idReversedHours)) {
                }
            }
        }
    }
    public static void cancelAppointment() {

    }
}
