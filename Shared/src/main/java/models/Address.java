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

    public Address() {
        addressID = null;
        address = null;
        aptNum = null;
        zipCode = -1;
        city = null;
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

    public UUID getAddressID() {
        return addressID;
    }

    public void setAddressID(UUID addressID) {
        this.addressID = addressID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}