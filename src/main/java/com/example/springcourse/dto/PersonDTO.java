package com.example.springcourse.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {

     String firstName;

     String lastName;

    @Min(value = 0)
     int age;

    @Email(message = "Invalid email format")
     String email;
}
