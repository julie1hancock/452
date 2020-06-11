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

package sdk.haha;

import java.util.*;

import sdk.haha.model.Empty;
import sdk.haha.model.Posting;


@com.amazonaws.mobileconnectors.apigateway.annotation.Service(endpoint = "https://omz2usaa4d.execute-api.us-west-2.amazonaws.com/dev")
public interface PostingsAPIClient {


    /**
     * A generic invoker to invoke any API Gateway endpoint.
     * @param request
     * @return ApiResponse
     */
    com.amazonaws.mobileconnectors.apigateway.ApiResponse execute(com.amazonaws.mobileconnectors.apigateway.ApiRequest request);
    
    /**
     * 
     * 
     * @param body 
     * @param contentType 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/posting", method = "POST")
    Empty postingPost(
            Posting body,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "content-type", location = "header")
                    String contentType);
    
    /**
     * 
     * 
     * @param id 
     * @param contentType 
     * @return Empty
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/posting/{id}", method = "GET")
    Empty postingIdGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "id", location = "path")
                    String id,
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "content-type", location = "header")
                    String contentType);
    
}

