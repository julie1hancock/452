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
}