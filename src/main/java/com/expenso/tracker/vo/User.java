package com.expenso.tracker.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private String firstName;
    private String lastName;
    private String emailId;
    private char gender;
    private int age;
    private String employeeType;
    private LocalDate dob;
    private String phoneNo;
    private String city;
    private String state;
    private String country;
    private String pinCode;

}
