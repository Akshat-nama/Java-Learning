package com.codingshuttle.springbootweb.springbootweb.dto;

import com.codingshuttle.springbootweb.springbootweb.annotations.EmployeeRoleValidation;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;
    @NotNull(message = "Name can not be null")
    private String name;
    @NotNull
    @Email(message = "Provide an valid email address")
    private String email;

    @Max(value = 80, message = "Age should be lesser than 80")
    @Min(value = 18, message = "Age should be greater than 18")
    private Integer age;

    @NotNull(message = "The role can not be null")
    @EmployeeRoleValidation
    private String role;
    private LocalDate dateOfJoining;
    private Boolean isActive;


}
