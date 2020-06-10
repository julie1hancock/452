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


public class UserProfileResult {
    @com.google.gson.annotations.SerializedName("name")
    private String name = null;
    @com.google.gson.annotations.SerializedName("username")
    private String username = null;
    @com.google.gson.annotations.SerializedName("followerCount")
    private Integer followerCount = null;
    @com.google.gson.annotations.SerializedName("followingCount")
    private Integer followingCount = null;
    @com.google.gson.annotations.SerializedName("photoURL")
    private String photoURL = null;

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

    /**
     * Gets photoURL
     *
     * @return photoURL
     **/
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Sets the value of photoURL.
     *
     * @param photoURL the new value
     */
    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

}
