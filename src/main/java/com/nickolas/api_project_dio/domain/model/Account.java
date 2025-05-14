package com.nickolas.api_project_dio.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(scale =13, precision = 2)
    private BigDecimal Balance;

    @Column(name = "additional_limit", scale =13, precision = 2)
    private BigDecimal limit;
}
