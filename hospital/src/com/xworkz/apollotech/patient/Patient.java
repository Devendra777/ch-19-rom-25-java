package com.xworkz.apollotech.patient;

import com.xworkz.apollotech.constants.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// lombok:
@NoArgsConstructor
@Setter
@Getter
public class Patient {

       private int patientId;
       private String patientName;
       private String address;
       private Gender gender;
       private int age ;
       private String diseaseName;

       // updateDiseaseNameByPatientName(String  , String)

}
