package com.odata.model;

import java.util.Map;

public class Territory {

    private String id;
    private String descriprion;
    private Integer regionId;

    public Territory() {
    }

    public Territory(Map<String, Object> entry) {
        id = (String) entry.get("TerritoryID");
        descriprion = ((String) entry.get("TerritoryDescription")).trim();
        regionId = (Integer) entry.get("RegionID");
    }

    public Integer getRegionId() {
        return regionId;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Territory {" +
                "id='" + id + '\'' +
                ", descriprion='" + descriprion + '\'' +
                ", regionId=" + regionId +
                '}';
    }
}

