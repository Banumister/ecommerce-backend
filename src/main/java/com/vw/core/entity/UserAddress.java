package com.vw.core.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "userAddress")
public class UserAddress {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "firstLine")
    private String firstLine;

    @Column(name = "secondLine")
    private String secondLine;

    @Column(name = "taluka")
    private String taluka;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private String state;

    @Column(name = "pinCode")
    private Integer pinCode;

}
