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
@Table(name = "userContactDetails")
public class UserContactDetails {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "mobileNumber")
    private Long mobileNumber;

    @Column(name = "email")
    private String email;

}
