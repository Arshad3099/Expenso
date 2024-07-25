package com.expenso.tracker.controller;

import com.expenso.tracker.vo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public User getUser() {
        return User.builder().firstName("Arshad").emailId("arshadbasha1999@gmail.com").age(24).pinCode("515591").city("Kadiri")
                .dob(LocalDate.of(1999, 8, 30)).state("Andhra Pradesh").employeeType("Salaried").country("India")
                .gender('M').phoneNo("6304320228").lastName("Basha").build();
    }
}
