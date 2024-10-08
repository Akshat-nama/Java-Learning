package com.akshat.firstJobApplication.job;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="job_table")
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String minSalary;
    private String maxSalary;
    private String description;
    private String location;

    public Jobs() {
    }
}
