package com.upwork.app.model.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PartnerAttribute {
    private boolean sponsored;
    private String redirect_apply;
    private String utm_medium;
    private String utm_campaign;
    private String keyword;
    private String search_fetch_id;
    private Long page;
    private Long order;
    private String city_center;
    private String utm_source;
    private String source;
}
