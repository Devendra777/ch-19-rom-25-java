package com.xworkz.apollotech.hospital;

import com.xworkz.apollotech.constants.Gender;
import com.xworkz.apollotech.patient.Patient;

// Parent / Super / Base
public class Hospital {
    public Hospital(int size) {
        patients = new Patient[size];
    }

    // CRUD on Patient
    //   Array declaration & Init of Patient type
    public Patient[] patients;
    int index;
    // CRUD

    public boolean addPatient(Patient patient) {
        boolean isPatientAdded = false;

        if (patient != null) {
            patients[index++] = patient;
            isPatientAdded = true;
        } else System.out.println("Invalid Patient");

        return isPatientAdded;
    }

    public void getAllPatients() {
        System.out.println("List of Patients are :");
        for (Patient patient : patients) {
            if (patient != null) {
                System.out.println("The patient Id is " + patient.getPatientId());
                System.out.println("The patient Name is " + patient.getPatientName());
                System.out.println("The patient Age is " + patient.getAge());
                System.out.println("--------------------------------");
            }
        }
    }


    public String getPatientNameById(int id) {
        String patientName = null;
        for (Patient patient : this.patients) {
            if (patient.getPatientId() == id) {
                patientName = patient.getPatientName();
            }
        }
        if (patientName == null) System.out.println("Patient name is not found with Patient Id " + id);
        return patientName;
    }

    public String getPatientAddressByName(String patientName) {
        String address = null;

        for (Patient patient : this.patients) {
            if (patient.getPatientName().equals(patientName)) {
                address = patient.getAddress();
            }
        }
        return address;
    }


    public Gender getGenderByPatientName(String patientName){
        Gender gender = null ;
         if(patientName != null) {
             for (Patient patient : patients) {
                 if (patient.getPatientName().equals(patientName)) {
                     gender = patient.getGender();
                 }
             }
         }
         if(gender == null) System.out.println(patientName + " is not found");
         return gender ;
      }


      public boolean updateDiseaseNameByPatientName(String  patientName, String updatedDiseaseName){
          boolean isDiseaseNameUpdated = false;

          if(patientName != null){
              for(Patient patient : patients){
                  if(patient.getPatientName().equals(patientName)){
                              patient.setDiseaseName(updatedDiseaseName);
                      isDiseaseNameUpdated = true ;
                  }
              }
          }
          if(isDiseaseNameUpdated == false) System.out.println(patientName + " not found ...");

          return isDiseaseNameUpdated;
      }

}
