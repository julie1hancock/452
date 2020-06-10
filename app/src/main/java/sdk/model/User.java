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

import twitteryo.model.UserPhoto;

public class User {
    @com.google.gson.annotations.SerializedName("username")
    private String username = null;
    @com.google.gson.annotations.SerializedName("password")
    private String password = null;
    @com.google.gson.annotations.SerializedName("name")
    private String name = null;
    @com.google.gson.annotations.SerializedName("photo")
    private UserPhoto photo = null;
    @com.google.gson.annotations.SerializedName("followerCount")
    private Integer followerCount = null;
    @com.google.gson.annotations.SerializedName("followingCount")
    private Integer followingCount = null;

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
     * Gets password
     *
     * @return password
     **/
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of password.
     *
     * @param password the new value
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets name
     *
     * @return name
     **/
    public String getName() {
        return name;
    }

    /**
     * Sets the value of name.
     *
     * @param name the new value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets photo
     *
     * @return photo
     **/
    public UserPhoto getPhoto() {
        return photo;
    }

    /**
     * Sets the value of photo.
     *
     * @param photo the new value
     */
    public void setPhoto(UserPhoto photo) {
        this.photo = photo;
    }

    /**
     * Gets followerCount
     *
     * @return followerCount
     **/
    public Integer getFollowerCount() {
        return followerCount;
    }

    /**
     * Sets the value of followerCount.
     *
     * @param followerCount the new value
     */
    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    /**
     * Gets followingCount
     *
     * @return followingCount
     **/
    public Integer getFollowingCount() {
        return followingCount;
    }

    /**
     * Sets the value of followingCount.
     *
     * @param followingCount the new value
     */
    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

}
