package com.odata.dto;

import com.odata.model.Region;
import org.apache.olingo.odata2.api.ep.entry.ODataEntry;

import java.util.ArrayList;
import java.util.List;

public class Regions {

    private List<Region> item = new ArrayList<>();

    public Regions() {
    }

    public Regions(List<ODataEntry> entries) {
        for (ODataEntry entry : entries) {
            item.add(new Region(entry.getProperties()));
        }
    }

    public List<Region> getItem() {
        return item;
    }
}


