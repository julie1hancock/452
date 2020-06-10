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
import twitteryo.model.StatusListResultStatusListStatusesItem;

public class StatusListResultStatusList {
    @com.google.gson.annotations.SerializedName("statuses")
    private List<StatusListResultStatusListStatusesItem> statuses = null;
    @com.google.gson.annotations.SerializedName("lastStatusID")
    private String lastStatusID = null;
    @com.google.gson.annotations.SerializedName("size")
    private Integer size = null;

    /**
     * Gets statuses
     *
     * @return statuses
     **/
    public List<StatusListResultStatusListStatusesItem> getStatuses() {
        return statuses;
    }

    /**
     * Sets the value of statuses.
     *
     * @param statuses the new value
     */
    public void setStatuses(List<StatusListResultStatusListStatusesItem> statuses) {
        this.statuses = statuses;
    }

    /**
     * Gets lastStatusID
     *
     * @return lastStatusID
     **/
    public String getLastStatusID() {
        return lastStatusID;
    }

    /**
     * Sets the value of lastStatusID.
     *
     * @param lastStatusID the new value
     */
    public void setLastStatusID(String lastStatusID) {
        this.lastStatusID = lastStatusID;
    }

    /**
     * Gets size
     *
     * @return size
     **/
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of size.
     *
     * @param size the new value
     */
    public void setSize(Integer size) {
        this.size = size;
    }

}
