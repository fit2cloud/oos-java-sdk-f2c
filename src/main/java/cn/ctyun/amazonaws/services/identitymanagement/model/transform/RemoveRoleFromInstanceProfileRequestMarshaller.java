/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package cn.ctyun.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.ctyun.amazonaws.AmazonClientException;
import cn.ctyun.amazonaws.DefaultRequest;
import cn.ctyun.amazonaws.Request;
import cn.ctyun.amazonaws.services.identitymanagement.model.*;
import cn.ctyun.amazonaws.transform.Marshaller;
import cn.ctyun.amazonaws.util.StringUtils;

/**
 * Remove Role From Instance Profile Request Marshaller
 */
public class RemoveRoleFromInstanceProfileRequestMarshaller implements Marshaller<Request<RemoveRoleFromInstanceProfileRequest>, RemoveRoleFromInstanceProfileRequest> {

    public Request<RemoveRoleFromInstanceProfileRequest> marshall(RemoveRoleFromInstanceProfileRequest removeRoleFromInstanceProfileRequest) {

        if (removeRoleFromInstanceProfileRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<RemoveRoleFromInstanceProfileRequest> request = new DefaultRequest<RemoveRoleFromInstanceProfileRequest>(removeRoleFromInstanceProfileRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "RemoveRoleFromInstanceProfile");
        request.addParameter("Version", "2010-05-08");

        if (removeRoleFromInstanceProfileRequest.getInstanceProfileName() != null) {
            request.addParameter("InstanceProfileName", StringUtils.fromString(removeRoleFromInstanceProfileRequest.getInstanceProfileName()));
        }
        if (removeRoleFromInstanceProfileRequest.getRoleName() != null) {
            request.addParameter("RoleName", StringUtils.fromString(removeRoleFromInstanceProfileRequest.getRoleName()));
        }


        return request;
    }
}
