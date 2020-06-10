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

import twitteryo.model.UserListResultUserList;

public class UserListResult {
    @com.google.gson.annotations.SerializedName("userList")
    private UserListResultUserList userList = null;
    @com.google.gson.annotations.SerializedName("lastKeyUsername")
    private String lastKeyUsername = null;

    /**
     * Gets userList
     *
     * @return userList
     **/
    public UserListResultUserList getUserList() {
        return userList;
    }

    /**
     * Sets the value of userList.
     *
     * @param userList the new value
     */
    public void setUserList(UserListResultUserList userList) {
        this.userList = userList;
    }

    /**
     * Gets lastKeyUsername
     *
     * @return lastKeyUsername
     **/
    public String getLastKeyUsername() {
        return lastKeyUsername;
    }

    /**
     * Sets the value of lastKeyUsername.
     *
     * @param lastKeyUsername the new value
     */
    public void setLastKeyUsername(String lastKeyUsername) {
        this.lastKeyUsername = lastKeyUsername;
    }

}
