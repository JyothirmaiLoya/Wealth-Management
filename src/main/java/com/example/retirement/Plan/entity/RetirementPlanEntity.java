package com.example.retirement.Plan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table

public class RetirementPlanEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)

    private int id;
    private String planName;
    private String description;
    private float planPrice;


}
