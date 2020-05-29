package models;

import java.util.*;

public class Rental{
        UUID rentalID;
        int numBedrooms;
        int numBathrooms;
        RentalType rentalType;
        Date contractStartDate;
        Date contractEndDate;
        int contractLength;

        public Rental(UUID rentalID, int numBedrooms, int numBathrooms, RentalType rentalType, Date contractStartDate, Date contractEndDate, int contractLength) {
                this.rentalID = rentalID;
                this.numBedrooms = numBedrooms;
                this.numBathrooms = numBathrooms;
                this.rentalType = rentalType;
                this.contractStartDate = contractStartDate;
                this.contractEndDate = contractEndDate;
                this.contractLength = contractLength;
        }

        @Override
        public String toString() {
                return "Rental{" +
                        "rentalID=" + rentalID +
                        ", numBedrooms=" + numBedrooms +
                        ", numBathrooms=" + numBathrooms +
                        ", rentalType=" + rentalType +
                        ", contractStartDate=" + contractStartDate +
                        ", contractEndDate=" + contractEndDate +
                        ", contractLength=" + contractLength +
                        '}';
        }
}

