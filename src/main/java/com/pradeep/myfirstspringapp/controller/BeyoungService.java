package com.pradeep.myfirstspringapp.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BeyoungService {
    public List<TShirts> getListOfTShirts() {
        List<AvailableSize> availableSizeList = new ArrayList<>();
        availableSizeList.add(AvailableSize.SMALL);
        availableSizeList.add(AvailableSize.MEDIUM);
        availableSizeList.add(AvailableSize.LARGE);
        TShirts tShirts = new TShirts("Red", availableSizeList);
        List<TShirts> tShirtsList = new ArrayList<>();
        tShirtsList.add(tShirts);
        return tShirtsList;
    }
}
