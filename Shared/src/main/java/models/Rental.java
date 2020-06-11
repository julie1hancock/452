package models;

import java.util.*;

public class Rental{
        UUID rentalID;
        double numBedrooms;
        double numBathrooms;
        Boolean isComplex;
        Boolean isBasement;
        Boolean isHouse;
        Date contractStartDate;
        Date contractEndDate;
        double contractLength;

        public Rental() {
                rentalID = null;
                numBedrooms = -1;
                numBathrooms = -1;
                contractStartDate = null;
                contractEndDate = null;
                contractLength = -1;
                isComplex = null;
                isHouse = null;
                isBasement = null;
        }

        public Rental(UUID rentalID, double numBedrooms, double numBathrooms, Boolean isComplex, Boolean isBasement, Boolean isHouse, Date contractStartDate, Date contractEndDate, double contractLength) {
                this.rentalID = rentalID;
                this.numBedrooms = numBedrooms;
                this.numBathrooms = numBathrooms;
                this.isComplex = isComplex;
                this.isBasement = isBasement;
                this.isHouse = isHouse;
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
                        ", isComplex=" + isComplex +
                        ", isBasement=" + isBasement +
                        ", isHouse=" + isHouse +
                        ", contractStartDate=" + contractStartDate +
                        ", contractEndDate=" + contractEndDate +
                        ", contractLength=" + contractLength +
                        '}';
        }

        public Boolean getComplex() {
                return isComplex;
        }

        public void setComplex(Boolean complex) {
                isComplex = complex;
        }

        public Boolean getBasement() {
                return isBasement;
        }

        public void setBasement(Boolean basement) {
                isBasement = basement;
        }

        public Boolean getHouse() {
                return isHouse;
        }

        public void setHouse(Boolean house) {
                isHouse = house;
        }

        public UUID getRentalID() {
                return rentalID;
        }

        public void setRentalID(UUID rentalID) {
                this.rentalID = rentalID;
        }

        public double getNumBedrooms() {
                return numBedrooms;
        }

        public void setNumBedrooms(double numBedrooms) {
                this.numBedrooms = numBedrooms;
        }

        public double getNumBathrooms() {
                return numBathrooms;
        }

        public void setNumBathrooms(double numBathrooms) {
                this.numBathrooms = numBathrooms;
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

        public double getContractLength() {
                return contractLength;
        }

        public void setContractLength(double contractLength) {
                this.contractLength = contractLength;
        }
}

