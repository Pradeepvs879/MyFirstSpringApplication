package com.pradeep.myfirstspringapp.controller;

import java.util.List;

public class TShirts {
    private String color;
    private List<AvailableSize> availableSizes;

    public TShirts(String color, List<AvailableSize> availableSizes) {
        this.color = color;
        this.availableSizes = availableSizes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<AvailableSize> getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(List<AvailableSize> availableSizes) {
        this.availableSizes = availableSizes;
    }
}
