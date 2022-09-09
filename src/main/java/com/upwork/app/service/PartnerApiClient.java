package com.upwork.app.service;

import com.upwork.app.model.dto.request.ApplicationRequest;
import com.upwork.app.model.dto.response.Info;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "app.feign.config.name", url = "${app.feign.config.url}")
public interface PartnerApiClient {

    @RequestMapping(method = RequestMethod.POST, value = "/application/easy-apply/")
    Info easyApply(@RequestHeader("x-api-key") String apiKey, @RequestBody ApplicationRequest applicationRequest);

}
