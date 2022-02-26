package com.odata.dto;

import com.odata.model.Territory;
import org.apache.olingo.odata2.api.ep.entry.ODataEntry;

import java.util.ArrayList;
import java.util.List;

public class Territories {

    private List<Territory> item = new ArrayList<>();

    public Territories() {

    }

    public Territories(List<ODataEntry> entries) {
        for (ODataEntry entry : entries) {
            item.add(new Territory(entry.getProperties()));
        }
    }

    public List<Territory> getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Territories{" +
                "item=" + item +
                '}';
    }
}
