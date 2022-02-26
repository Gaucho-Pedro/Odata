package com.odata.model;

import com.odata.dto.Territories;

import java.util.List;
import java.util.Map;

public class Region {

    private Integer id;
    private String description;
    private Territories territories;

    public Region(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Region(Map<String, Object> entry) {
        description = ((String) entry.get("RegionDescription")).trim();
        id = (Integer) entry.get("RegionID");
        territories = new Territories();
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTerritories(Territories territories) {
        for (Territory territory : territories.getItem()) {
            if (this.id.equals(territory.getRegionId())) {
                this.territories.getItem().add(territory);
            }
        }
    }

    public Territories getTerritories() {
        return territories;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", territories=" + territories +
                '}';
    }
}
