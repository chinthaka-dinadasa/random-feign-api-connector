package com.upwork.app.controller;

import com.upwork.app.model.dto.request.ApplicationRequest;
import com.upwork.app.service.ApplicationSubmissionService;
import com.upwork.app.service.PartnerApiClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/random")
public class RandomController {

    private final ApplicationSubmissionService submissionService;

    @PostMapping
    public ResponseEntity<Void> readRandomData () {
        submissionService.processApplication();
        return ResponseEntity.ok().build();
    }

}
