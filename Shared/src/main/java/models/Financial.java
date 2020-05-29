package models;

import java.util.*;

public class Financial {
    UUID financialID;
    double monthlyRent;
    double monthlyUtilities;
    double securityDeposit;
    double parkingFee;
    double applicationFee;

    public Financial(UUID financialID, double monthlyRent, double monthlyUtilities, double securityDeposit, double parkingFee, double applicationFee) {
        this.financialID = financialID;
        this.monthlyRent = monthlyRent;
        this.monthlyUtilities = monthlyUtilities;
        this.securityDeposit = securityDeposit;
        this.parkingFee = parkingFee;
        this.applicationFee = applicationFee;
    }

    public Financial() {
        financialID = null;
        monthlyRent = -1;
        monthlyUtilities = -1;
        securityDeposit = -1;
        parkingFee = -1;
        applicationFee = -1;
    }

    @Override
    public String toString() {
        return "Financial{" +
                "financialID=" + financialID +
                ", monthlyRent=" + monthlyRent +
                ", monthlyUtilities=" + monthlyUtilities +
                ", securityDeposit=" + securityDeposit +
                ", parkingFee=" + parkingFee +
                ", applicationFee=" + applicationFee +
                '}';
    }


    public UUID getFinancialID() {
        return financialID;
    }

    public void setFinancialID(UUID financialID) {
        this.financialID = financialID;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public double getMonthlyUtilities() {
        return monthlyUtilities;
    }

    public void setMonthlyUtilities(double monthlyUtilities) {
        this.monthlyUtilities = monthlyUtilities;
    }

    public double getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(double securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public double getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(double parkingFee) {
        this.parkingFee = parkingFee;
    }

    public double getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(double applicationFee) {
        this.applicationFee = applicationFee;
    }
}