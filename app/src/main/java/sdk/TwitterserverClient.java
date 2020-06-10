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

package sdk;

import java.util.*;

import twitteryo.model.StatusListResult;
import twitteryo.model.Empty;
import twitteryo.model.User;
import twitteryo.model.StringModel;
import twitteryo.model.UserListResult;
import twitteryo.model.UserProfileResult;
import twitteryo.model.BooleanResult;
import twitteryo.model.Status;


@com.amazonaws.mobileconnectors.apigateway.annotation.Service(endpoint = "https://24cr09qa4j.execute-api.us-west-2.amazonaws.com/s")
public interface TwitterserverClient {


    /**
     * A generic invoker to invoke any API Gateway endpoint.
     * @param request
     * @return ApiResponse
     */
    com.amazonaws.mobileconnectors.apigateway.ApiResponse execute(com.amazonaws.mobileconnectors.apigateway.ApiRequest request);
    
    /**
     * 
     * 
     * @param pageSize 
     * @param hashtag 
     * @param lastKeyStatusID 
     * @return StatusListResult
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/gethashtags", method = "GET")
    StatusListResult gethashtagsGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "pageSize", location = "query")
                    String pageSize,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "hashtag", location = "query")
                    String hashtag,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "lastKeyStatusID", location = "query")
                    String lastKeyStatusID);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/gethashtags", method = "OPTIONS")
    Empty gethashtagsOptions();
    
    /**
     * 
     * 
     * @param body 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/login", method = "POST")
    Empty loginPost(
            User body);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/login", method = "OPTIONS")
    Empty loginOptions();
    
    /**
     * 
     * 
     * @param body 
     * @return StringModel
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/register", method = "POST")
    StringModel registerPost(
            User body);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/register", method = "OPTIONS")
    Empty registerOptions();
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}", method = "OPTIONS")
    Empty userOptions();
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/follow", method = "OPTIONS")
    Empty userFollowOptions();
    
    /**
     * 
     * 
     * @param otheruser 
     * @param user 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/follow/{otheruser}", method = "POST")
    Empty userFollowOtheruserPost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "otheruser", location = "path")
                    String otheruser,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
                    String user);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/follow/{otheruser}", method = "OPTIONS")
    Empty userFollowOtheruserOptions();
    
    /**
     * 
     * 
     * @param user 
     * @param pageSize 
     * @param lastKey 
     * @return StatusListResult
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/getfeed", method = "GET")
    StatusListResult userGetfeedGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
                    String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "pageSize", location = "query")
                    String pageSize,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "lastKey", location = "query")
                    String lastKey);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/getfeed", method = "OPTIONS")
    Empty userGetfeedOptions();
    
    /**
     * 
     * 
     * @param user 
     * @param pageSize 
     * @param lastKey 
     * @return UserListResult
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/getfollowers", method = "GET")
    UserListResult userGetfollowersGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
                    String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "pageSize", location = "query")
                    String pageSize,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "lastKey", location = "query")
                    String lastKey);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/getfollowers", method = "OPTIONS")
    Empty userGetfollowersOptions();
    
    /**
     * 
     * 
     * @param user 
     * @param pageSize 
     * @param lastKey 
     * @return UserListResult
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/getfollowing", method = "GET")
    UserListResult userGetfollowingGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
                    String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "pageSize", location = "query")
                    String pageSize,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "lastKey", location = "query")
                    String lastKey);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/getfollowing", method = "OPTIONS")
    Empty userGetfollowingOptions();
    
    /**
     * 
     * 
     * @param user 
     * @return UserProfileResult
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/getprofile", method = "GET")
    UserProfileResult userGetprofileGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
                    String user);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/getprofile", method = "OPTIONS")
    Empty userGetprofileOptions();
    
    /**
     * 
     * 
     * @param user 
     * @param pageSize 
     * @param lastKey 
     * @return StatusListResult
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/getstory", method = "GET")
    StatusListResult userGetstoryGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
                    String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "pageSize", location = "query")
                    String pageSize,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "lastKey", location = "query")
                    String lastKey);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/getstory", method = "OPTIONS")
    Empty userGetstoryOptions();
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/isfollowing", method = "OPTIONS")
    Empty userIsfollowingOptions();
    
    /**
     * 
     * 
     * @param otheruser 
     * @param user 
     * @return BooleanResult
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/isfollowing/{otheruser}", method = "GET")
    BooleanResult userIsfollowingOtheruserGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "otheruser", location = "path")
                    String otheruser,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
                    String user);
    
    /**
     * 
     * 
     * @param user 
     * @param body 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/tweet", method = "POST")
    Empty userTweetPost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
                    String user,
            Status body);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/tweet", method = "OPTIONS")
    Empty userTweetOptions();
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/unfollow", method = "OPTIONS")
    Empty userUnfollowOptions();
    
    /**
     * 
     * 
     * @param otheruser 
     * @param user 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/unfollow/{otheruser}", method = "POST")
    Empty userUnfollowOtheruserPost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "otheruser", location = "path")
                    String otheruser,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
                    String user);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/unfollow/{otheruser}", method = "OPTIONS")
    Empty userUnfollowOtheruserOptions();
    
    /**
     * 
     * 
     * @param user 
     * @param photoURL 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/updateprofilepicture", method = "POST")
    Empty userUpdateprofilepicturePost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "user", location = "path")
                    String user,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "photoURL", location = "query")
                    String photoURL);
    
    /**
     * 
     * 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/{user}/updateprofilepicture", method = "OPTIONS")
    Empty userUpdateprofilepictureOptions();
    
}

