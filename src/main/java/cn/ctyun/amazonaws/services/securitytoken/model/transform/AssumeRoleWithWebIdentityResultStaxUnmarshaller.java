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

package cn.ctyun.amazonaws.services.securitytoken.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import cn.ctyun.amazonaws.services.securitytoken.model.*;
import cn.ctyun.amazonaws.transform.MapEntry;
import cn.ctyun.amazonaws.transform.StaxUnmarshallerContext;
import cn.ctyun.amazonaws.transform.Unmarshaller;
import cn.ctyun.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Assume Role With Web Identity Result StAX Unmarshaller
 */
public class AssumeRoleWithWebIdentityResultStaxUnmarshaller implements Unmarshaller<AssumeRoleWithWebIdentityResult, StaxUnmarshallerContext> {

    public AssumeRoleWithWebIdentityResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentityResult = new AssumeRoleWithWebIdentityResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return assumeRoleWithWebIdentityResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("Credentials", targetDepth)) {
                    assumeRoleWithWebIdentityResult.setCredentials(CredentialsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SubjectFromWebIdentityToken", targetDepth)) {
                    assumeRoleWithWebIdentityResult.setSubjectFromWebIdentityToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AssumedRoleUser", targetDepth)) {
                    assumeRoleWithWebIdentityResult.setAssumedRoleUser(AssumedRoleUserStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PackedPolicySize", targetDepth)) {
                    assumeRoleWithWebIdentityResult.setPackedPolicySize(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return assumeRoleWithWebIdentityResult;
                }
            }
        }
    }

    private static AssumeRoleWithWebIdentityResultStaxUnmarshaller instance;
    public static AssumeRoleWithWebIdentityResultStaxUnmarshaller getInstance() {
        if (instance == null) instance = new AssumeRoleWithWebIdentityResultStaxUnmarshaller();
        return instance;
    }
}
    