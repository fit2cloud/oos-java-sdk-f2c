/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package cn.ctyun.amazonaws.internal;

public class DynamoDBBackoffStrategy extends CustomBackoffStrategy {
    public int getBackoffPeriod(int retries) {
        return (retries == 0) ? 0 : 50 * (int)Math.pow(2, retries - 1);
    }

    public static final CustomBackoffStrategy DEFAULT = new DynamoDBBackoffStrategy();
}