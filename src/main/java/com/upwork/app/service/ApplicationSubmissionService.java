package com.upwork.app.service;

import com.upwork.app.model.dto.request.Applicant;
import com.upwork.app.model.dto.request.ApplicationRequest;
import com.upwork.app.model.dto.request.Job;
import com.upwork.app.model.dto.request.PartnerAttribute;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ApplicationSubmissionService {

    @Value("${app.feign.api.key}")
    private String apiKey;

    private final PartnerApiClient partnerApiClient;

    public void processApplication(){
        ApplicationRequest request = ApplicationRequest.builder()
                .enqueue(true)
                .get_person_token(1L)
                .applicant(Applicant.builder().build())
                .job(Job.builder().build())
                .partner_attributes(PartnerAttribute.builder().build())
                .build();
        partnerApiClient.easyApply(apiKey, request);
    }

}
