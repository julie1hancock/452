package models;

import java.util.*;


public class Address {
    UUID addressID;
    String address;
    String aptNum;
    int zipCode;
    String city;

    public Address(UUID addressID, String address, String aptNum, int zipCode, String city) {
        this.addressID = addressID;
        this.address = address;
        this.aptNum = aptNum;
        this.zipCode = zipCode;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressID=" + addressID +
                ", address='" + address + '\'' +
                ", aptNum='" + aptNum + '\'' +
                ", zipCode=" + zipCode +
                ", city='" + city + '\'' +
                '}';
    }
}