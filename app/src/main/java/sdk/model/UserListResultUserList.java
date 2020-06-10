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
import twitteryo.model.UserListResultUserListUsersItem;

public class UserListResultUserList {
    @com.google.gson.annotations.SerializedName("users")
    private List<UserListResultUserListUsersItem> users = null;
    @com.google.gson.annotations.SerializedName("lastUser")
    private String lastUser = null;
    @com.google.gson.annotations.SerializedName("size")
    private Integer size = null;

    /**
     * Gets users
     *
     * @return users
     **/
    public List<UserListResultUserListUsersItem> getUsers() {
        return users;
    }

    /**
     * Sets the value of users.
     *
     * @param users the new value
     */
    public void setUsers(List<UserListResultUserListUsersItem> users) {
        this.users = users;
    }

    /**
     * Gets lastUser
     *
     * @return lastUser
     **/
    public String getLastUser() {
        return lastUser;
    }

    /**
     * Sets the value of lastUser.
     *
     * @param lastUser the new value
     */
    public void setLastUser(String lastUser) {
        this.lastUser = lastUser;
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
