package com.xworkz.apollotech;

import com.xworkz.apollotech.constants.Gender;
import com.xworkz.apollotech.hospital.Hospital;
import com.xworkz.apollotech.patient.Patient;

import java.util.Scanner;

public class HospitalRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of Patients to be added");
        int size = scanner.nextInt();
        Hospital hospital = new Hospital(size);
        System.out.println("The patients available are: " + hospital.patients.length);
        for (int i = 0; i < size; i++) {
            Patient patient = new Patient();
            System.out.println("Enter the patient Id");
            patient.setPatientId(scanner.nextInt());
            System.out.println("Enter the Patient name");
            patient.setPatientName(scanner.next());
            System.out.println("Enter the patient Age");
            patient.setAge(scanner.nextInt());
            System.out.println("Enter the gender of Patient");
            patient.setGender(Gender.valueOf(scanner.next().toUpperCase()));
            hospital.addPatient(patient);
        }
        hospital.getAllPatients();

        System.out.println("Enter the patient name to fetch gender ");
      Gender gender =   hospital.getGenderByPatientName(scanner.next());
        System.out.println(gender);


    }
}
