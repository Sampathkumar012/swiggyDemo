package com.neoteric.Swiggy.Model;

import java.util.List;

public class Restaurant {
    public String restaurantName;
    public Address address;
    public List<Menu> menuList;
    public String rating;

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                ", address=" + address +
                ", menuList=" + menuList +
                ", rating='" + rating + '\'' +
                '}';
    }
}
