package com.company;

public class Patients {
   private static  int next_patient_id=1;
    private int patient_id;
    private String first_name;
    private String last_name;
    private int age;
    //Constructor for Patient class-------------------------------------------------------------------------------------
    public Patient(int patient_id, String first_name, String last_name, int age) {
        patient_id=next_patient_id++;
        this.first_name=first_name;
        this.last_name=last_name;
        this.age=age;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getAge() {
        return age;
    }
    public static final String delimiter = ",";
    public static void read(String csvFile) {
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            while((line = br.readLine()) != null) {
                tempArr = line.split(delimiter);
                for(String tempStr : tempArr) {
                    System.out.print(tempStr + " ");
                }
                System.out.println();
            }
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
   }
