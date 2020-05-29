package models;

import java.util.*;


public class Amenities {
    UUID amenitiesID;
    Boolean hasWasherDryer;
    Boolean hasParking;
    Boolean isFurnished;
    Boolean isPetFriendly;

    public Amenities(UUID amenitiesID, Boolean hasWasherDryer, Boolean hasParking, Boolean isFurnished, Boolean isPetFriendly) {
        this.amenitiesID = amenitiesID;
        this.hasWasherDryer = hasWasherDryer;
        this.hasParking = hasParking;
        this.isFurnished = isFurnished;
        this.isPetFriendly = isPetFriendly;
    }

    public Amenities() {
        amenitiesID = null;
        hasWasherDryer = null;
        hasParking = null;
        isFurnished = null;
        isPetFriendly = null;
    }

    @Override
    public String toString() {
        return "Amenities{" +
                "amenitiesID=" + amenitiesID +
                ", hasWasherDryer=" + hasWasherDryer +
                ", hasParking=" + hasParking +
                ", isFurnished=" + isFurnished +
                ", isPetFriendly=" + isPetFriendly +
                '}';
    }

    public UUID getAmenitiesID() {
        return amenitiesID;
    }

    public void setAmenitiesID(UUID amenitiesID) {
        this.amenitiesID = amenitiesID;
    }

    public Boolean getHasWasherDryer() {
        return hasWasherDryer;
    }

    public void setHasWasherDryer(Boolean hasWasherDryer) {
        this.hasWasherDryer = hasWasherDryer;
    }

    public Boolean getHasParking() {
        return hasParking;
    }

    public void setHasParking(Boolean hasParking) {
        this.hasParking = hasParking;
    }

    public Boolean getFurnished() {
        return isFurnished;
    }

    public void setFurnished(Boolean furnished) {
        isFurnished = furnished;
    }

    public Boolean getPetFriendly() {
        return isPetFriendly;
    }

    public void setPetFriendly(Boolean petFriendly) {
        isPetFriendly = petFriendly;
    }
}