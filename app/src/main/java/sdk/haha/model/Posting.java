/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package sdk.haha.model;


public class Posting {
    @com.google.gson.annotations.SerializedName("address")
    private String address = null;
    @com.google.gson.annotations.SerializedName("applicationFee")
    private String applicationFee = null;
    @com.google.gson.annotations.SerializedName("aptNum")
    private String aptNum = null;
    @com.google.gson.annotations.SerializedName("city")
    private String city = null;
    @com.google.gson.annotations.SerializedName("contractLength")
    private String contractLength = null;
    @com.google.gson.annotations.SerializedName("datePosted")
    private String datePosted = null;
    @com.google.gson.annotations.SerializedName("hasParking")
    private Boolean hasParking = null;
    @com.google.gson.annotations.SerializedName("hasWasherDryer")
    private Boolean hasWasherDryer = null;
    @com.google.gson.annotations.SerializedName("isFurnished")
    private Boolean isFurnished = null;
    @com.google.gson.annotations.SerializedName("isPetFriendly")
    private Boolean isPetFriendly = null;
    @com.google.gson.annotations.SerializedName("monthlyRent")
    private String monthlyRent = null;
    @com.google.gson.annotations.SerializedName("monthlyUtilities")
    private String monthlyUtilities = null;
    @com.google.gson.annotations.SerializedName("numBathrooms")
    private String numBathrooms = null;
    @com.google.gson.annotations.SerializedName("numBedrooms")
    private String numBedrooms = null;
    @com.google.gson.annotations.SerializedName("parkingFee")
    private String parkingFee = null;
    @com.google.gson.annotations.SerializedName("PostingId")
    private String postingId = null;
    @com.google.gson.annotations.SerializedName("postLink")
    private String postLink = null;
    @com.google.gson.annotations.SerializedName("securityDeposit")
    private String securityDeposit = null;
    @com.google.gson.annotations.SerializedName("type")
    private String type = null;
    @com.google.gson.annotations.SerializedName("zipCode")
    private String zipCode = null;

    /**
     * Gets address
     *
     * @return address
     **/
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of address.
     *
     * @param address the new value
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets applicationFee
     *
     * @return applicationFee
     **/
    public String getApplicationFee() {
        return applicationFee;
    }

    /**
     * Sets the value of applicationFee.
     *
     * @param applicationFee the new value
     */
    public void setApplicationFee(String applicationFee) {
        this.applicationFee = applicationFee;
    }

    /**
     * Gets aptNum
     *
     * @return aptNum
     **/
    public String getAptNum() {
        return aptNum;
    }

    /**
     * Sets the value of aptNum.
     *
     * @param aptNum the new value
     */
    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    /**
     * Gets city
     *
     * @return city
     **/
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of city.
     *
     * @param city the new value
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets contractLength
     *
     * @return contractLength
     **/
    public String getContractLength() {
        return contractLength;
    }

    /**
     * Sets the value of contractLength.
     *
     * @param contractLength the new value
     */
    public void setContractLength(String contractLength) {
        this.contractLength = contractLength;
    }

    /**
     * Gets datePosted
     *
     * @return datePosted
     **/
    public String getDatePosted() {
        return datePosted;
    }

    /**
     * Sets the value of datePosted.
     *
     * @param datePosted the new value
     */
    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    /**
     * Gets hasParking
     *
     * @return hasParking
     **/
    public Boolean getHasParking() {
        return hasParking;
    }

    /**
     * Sets the value of hasParking.
     *
     * @param hasParking the new value
     */
    public void setHasParking(Boolean hasParking) {
        this.hasParking = hasParking;
    }

    /**
     * Gets hasWasherDryer
     *
     * @return hasWasherDryer
     **/
    public Boolean getHasWasherDryer() {
        return hasWasherDryer;
    }

    /**
     * Sets the value of hasWasherDryer.
     *
     * @param hasWasherDryer the new value
     */
    public void setHasWasherDryer(Boolean hasWasherDryer) {
        this.hasWasherDryer = hasWasherDryer;
    }

    /**
     * Gets isFurnished
     *
     * @return isFurnished
     **/
    public Boolean getIsFurnished() {
        return isFurnished;
    }

    /**
     * Sets the value of isFurnished.
     *
     * @param isFurnished the new value
     */
    public void setIsFurnished(Boolean isFurnished) {
        this.isFurnished = isFurnished;
    }

    /**
     * Gets isPetFriendly
     *
     * @return isPetFriendly
     **/
    public Boolean getIsPetFriendly() {
        return isPetFriendly;
    }

    /**
     * Sets the value of isPetFriendly.
     *
     * @param isPetFriendly the new value
     */
    public void setIsPetFriendly(Boolean isPetFriendly) {
        this.isPetFriendly = isPetFriendly;
    }

    /**
     * Gets monthlyRent
     *
     * @return monthlyRent
     **/
    public String getMonthlyRent() {
        return monthlyRent;
    }

    /**
     * Sets the value of monthlyRent.
     *
     * @param monthlyRent the new value
     */
    public void setMonthlyRent(String monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    /**
     * Gets monthlyUtilities
     *
     * @return monthlyUtilities
     **/
    public String getMonthlyUtilities() {
        return monthlyUtilities;
    }

    /**
     * Sets the value of monthlyUtilities.
     *
     * @param monthlyUtilities the new value
     */
    public void setMonthlyUtilities(String monthlyUtilities) {
        this.monthlyUtilities = monthlyUtilities;
    }

    /**
     * Gets numBathrooms
     *
     * @return numBathrooms
     **/
    public String getNumBathrooms() {
        return numBathrooms;
    }

    /**
     * Sets the value of numBathrooms.
     *
     * @param numBathrooms the new value
     */
    public void setNumBathrooms(String numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    /**
     * Gets numBedrooms
     *
     * @return numBedrooms
     **/
    public String getNumBedrooms() {
        return numBedrooms;
    }

    /**
     * Sets the value of numBedrooms.
     *
     * @param numBedrooms the new value
     */
    public void setNumBedrooms(String numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    /**
     * Gets parkingFee
     *
     * @return parkingFee
     **/
    public String getParkingFee() {
        return parkingFee;
    }

    /**
     * Sets the value of parkingFee.
     *
     * @param parkingFee the new value
     */
    public void setParkingFee(String parkingFee) {
        this.parkingFee = parkingFee;
    }

    /**
     * Gets postingId
     *
     * @return postingId
     **/
    public String getPostingId() {
        return postingId;
    }

    /**
     * Sets the value of postingId.
     *
     * @param postingId the new value
     */
    public void setPostingId(String postingId) {
        this.postingId = postingId;
    }

    /**
     * Gets postLink
     *
     * @return postLink
     **/
    public String getPostLink() {
        return postLink;
    }

    /**
     * Sets the value of postLink.
     *
     * @param postLink the new value
     */
    public void setPostLink(String postLink) {
        this.postLink = postLink;
    }

    /**
     * Gets securityDeposit
     *
     * @return securityDeposit
     **/
    public String getSecurityDeposit() {
        return securityDeposit;
    }

    /**
     * Sets the value of securityDeposit.
     *
     * @param securityDeposit the new value
     */
    public void setSecurityDeposit(String securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    /**
     * Gets type
     *
     * @return type
     **/
    public String getType() {
        return type;
    }

    /**
     * Sets the value of type.
     *
     * @param type the new value
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets zipCode
     *
     * @return zipCode
     **/
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of zipCode.
     *
     * @param zipCode the new value
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

}
