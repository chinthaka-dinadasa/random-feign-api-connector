package com.upwork.app.model.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class EasyApplyResponse {
    private String developer_message;
    private List<String> errors;
    private Info info;
}
