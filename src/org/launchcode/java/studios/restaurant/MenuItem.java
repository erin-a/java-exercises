package org.launchcode.java.studios.restaurant;


//menu item has a
// price - double
// description - String
// category - separate class or string?
// new / not new - boolean?
// update date - Date

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }

}
