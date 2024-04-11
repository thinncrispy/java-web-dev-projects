package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    // allow for default constructor


    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
