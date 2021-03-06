/**
 *
 * Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.databridge.core.exception;

/**
 * WSO2Event conversion exception
 */
public class EventConversionException extends RuntimeException {
    private String errorMessage;

    public EventConversionException() {
    }

    public EventConversionException(String message) {
        super(message);
        errorMessage = message;
    }

    public EventConversionException(String message, Throwable cause) {
        super(message, cause);
        errorMessage = message;
    }

    public EventConversionException(Throwable cause) {
        super(cause);
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
