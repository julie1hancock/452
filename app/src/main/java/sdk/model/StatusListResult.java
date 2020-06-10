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

import twitteryo.model.StatusListResultStatusList;

public class StatusListResult {
    @com.google.gson.annotations.SerializedName("statusList")
    private StatusListResultStatusList statusList = null;
    @com.google.gson.annotations.SerializedName("lastKeyStatusID")
    private String lastKeyStatusID = null;

    /**
     * Gets statusList
     *
     * @return statusList
     **/
    public StatusListResultStatusList getStatusList() {
        return statusList;
    }

    /**
     * Sets the value of statusList.
     *
     * @param statusList the new value
     */
    public void setStatusList(StatusListResultStatusList statusList) {
        this.statusList = statusList;
    }

    /**
     * Gets lastKeyStatusID
     *
     * @return lastKeyStatusID
     **/
    public String getLastKeyStatusID() {
        return lastKeyStatusID;
    }

    /**
     * Sets the value of lastKeyStatusID.
     *
     * @param lastKeyStatusID the new value
     */
    public void setLastKeyStatusID(String lastKeyStatusID) {
        this.lastKeyStatusID = lastKeyStatusID;
    }

}
