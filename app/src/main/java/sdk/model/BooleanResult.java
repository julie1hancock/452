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


public class BooleanResult {
    @com.google.gson.annotations.SerializedName("bool")
    private Boolean bool = null;

    /**
     * Gets bool
     *
     * @return bool
     **/
    public Boolean getBool() {
        return bool;
    }

    /**
     * Sets the value of bool.
     *
     * @param bool the new value
     */
    public void setBool(Boolean bool) {
        this.bool = bool;
    }

}
