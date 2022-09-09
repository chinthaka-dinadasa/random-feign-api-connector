package com.upwork.app.model.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Applicant {
    private String email;
    private String fullName;
    private String phoneNumber;
    private String resume;
}
