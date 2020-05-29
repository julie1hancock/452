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
}