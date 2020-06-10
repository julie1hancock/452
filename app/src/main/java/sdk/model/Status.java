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

package sdk.model;

import java.util.*;
import twitteryo.model.StatusAttachment;
import twitteryo.model.StatusEmbeddedAttributesItem;

public class Status {
    @com.google.gson.annotations.SerializedName("embeddedAttributes")
    private List<StatusEmbeddedAttributesItem> embeddedAttributes = null;
    @com.google.gson.annotations.SerializedName("message")
    private String message = null;
    @com.google.gson.annotations.SerializedName("username")
    private String username = null;
    @com.google.gson.annotations.SerializedName("timeStamp")
    private String timeStamp = null;
    @com.google.gson.annotations.SerializedName("attachment")
    private StatusAttachment attachment = null;
    @com.google.gson.annotations.SerializedName("statusID")
    private String statusID = null;
    @com.google.gson.annotations.SerializedName("user")
    private String user = null;

    /**
     * Gets embeddedAttributes
     *
     * @return embeddedAttributes
     **/
    public List<StatusEmbeddedAttributesItem> getEmbeddedAttributes() {
        return embeddedAttributes;
    }

    /**
     * Sets the value of embeddedAttributes.
     *
     * @param embeddedAttributes the new value
     */
    public void setEmbeddedAttributes(List<StatusEmbeddedAttributesItem> embeddedAttributes) {
        this.embeddedAttributes = embeddedAttributes;
    }

    /**
     * Gets message
     *
     * @return message
     **/
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of message.
     *
     * @param message the new value
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets username
     *
     * @return username
     **/
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of username.
     *
     * @param username the new value
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets timeStamp
     *
     * @return timeStamp
     **/
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of timeStamp.
     *
     * @param timeStamp the new value
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * Gets attachment
     *
     * @return attachment
     **/
    public StatusAttachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of attachment.
     *
     * @param attachment the new value
     */
    public void setAttachment(StatusAttachment attachment) {
        this.attachment = attachment;
    }

    /**
     * Gets statusID
     *
     * @return statusID
     **/
    public String getStatusID() {
        return statusID;
    }

    /**
     * Sets the value of statusID.
     *
     * @param statusID the new value
     */
    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    /**
     * Gets user
     *
     * @return user
     **/
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of user.
     *
     * @param user the new value
     */
    public void setUser(String user) {
        this.user = user;
    }

}
