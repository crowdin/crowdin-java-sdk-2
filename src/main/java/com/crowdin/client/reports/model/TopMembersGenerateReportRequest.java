package com.crowdin.client.reports.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class TopMembersGenerateReportRequest extends GenerateReportRequest {

    private String name = "top-members";
    private Schema schema;

    @Data
    public static class Schema {
        private Unit unit;
        private String languageId;
        private ReportsFormat format;
        private Date dateFrom;
        private Date dateTo;
    }

}
