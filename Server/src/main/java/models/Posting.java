package models;

import java.sql.Date;
import java.util.Objects;

public class Posting {
    private String postingID;
    private String addressID;
    private Date datePosted;

    public Posting() {
        postingID = null;
        addressID = null;
        datePosted = null;
    }

    public String getPostingID() {
        return postingID;
    }

    public void setPostingID(String postingID) {
        this.postingID = postingID;
    }

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public Posting(String postingID, String addressID, Date datePosted) {
        this.postingID = postingID;
        this.addressID = addressID;
        this.datePosted = datePosted;
    }

    @Override
    public String toString() {
        return "Posting{" +
                "postingID=" + postingID +
                ", addressID=" + addressID +
                ", datePosted=" + datePosted +
                '}';
    }

    public boolean isValid() {
        return postingID != null && addressID != null && datePosted != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posting posting = (Posting) o;
        return Objects.equals(postingID, posting.postingID) &&
                Objects.equals(addressID, posting.addressID) &&
                Objects.equals(datePosted, posting.datePosted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postingID, addressID, datePosted);
    }
}