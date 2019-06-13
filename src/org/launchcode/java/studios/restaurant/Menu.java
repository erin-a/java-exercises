package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

// has a s
// category section
// items
public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu() {
        this.items = new ArrayList<>();
        this.lastUpdated = new Date();
    }


}

