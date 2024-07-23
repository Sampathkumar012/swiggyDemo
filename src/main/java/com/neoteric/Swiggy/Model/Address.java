package com.neoteric.Swiggy.Model;

public class Address {
    public String area;
    public String streetName;
    public String pinCode;

    public Address(String area, String streetName, String pinCode) {
        this.area = area;
        this.streetName = streetName;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", streetName='" + streetName + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
