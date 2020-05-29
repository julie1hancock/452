package models;

import java.util.*;

public class Rental{
        UUID rentalID;
        int numBedrooms;
        double numBathrooms;
        RentalType rentalType;
        Date contractStartDate;
        Date contractEndDate;
        int contractLength;

        public Rental() {
                rentalID = null;
                numBedrooms = -1;
                numBathrooms = -1;
                rentalType = null;
                contractStartDate = null;
                contractEndDate = null;
                contractLength = -1;
        }

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

        public UUID getRentalID() {
                return rentalID;
        }

        public void setRentalID(UUID rentalID) {
                this.rentalID = rentalID;
        }

        public int getNumBedrooms() {
                return numBedrooms;
        }

        public void setNumBedrooms(int numBedrooms) {
                this.numBedrooms = numBedrooms;
        }

        public double getNumBathrooms() {
                return numBathrooms;
        }

        public void setNumBathrooms(double numBathrooms) {
                this.numBathrooms = numBathrooms;
        }

        public RentalType getRentalType() {
                return rentalType;
        }

        public void setRentalType(RentalType rentalType) {
                this.rentalType = rentalType;
        }

        public Date getContractStartDate() {
                return contractStartDate;
        }

        public void setContractStartDate(Date contractStartDate) {
                this.contractStartDate = contractStartDate;
        }

        public Date getContractEndDate() {
                return contractEndDate;
        }

        public void setContractEndDate(Date contractEndDate) {
                this.contractEndDate = contractEndDate;
        }

        public int getContractLength() {
                return contractLength;
        }

        public void setContractLength(int contractLength) {
                this.contractLength = contractLength;
        }
}

