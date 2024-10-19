package com.vw.core.dto;

import com.vw.core.entity.UserContactDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserProfileDto {

    private String userId;
    private String fullName;
    private char gender;
    private UserContactDetails contact_details_id;

}
