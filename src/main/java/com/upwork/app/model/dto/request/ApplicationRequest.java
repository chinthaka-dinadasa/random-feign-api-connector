package com.upwork.app.model.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApplicationRequest {
    private Applicant applicant;
    private Long get_person_token;
    private Boolean enqueue;
    private Job job;
    private PartnerAttribute partner_attributes;
}
