package com.vw.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private int id;

    private String userId;

    private String firstName;

    private String lastName;

    private String fullName;

    private char gender;
}
