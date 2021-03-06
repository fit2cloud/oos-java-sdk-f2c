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

package cn.ctyun.amazonaws.services.support.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.JsonToken;

import cn.ctyun.amazonaws.services.support.model.*;
import cn.ctyun.amazonaws.transform.*;
import cn.ctyun.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;

import static org.codehaus.jackson.JsonToken.*;

/**
 * Describe Severity Levels Result JSON Unmarshaller
 */
public class DescribeSeverityLevelsResultJsonUnmarshaller implements Unmarshaller<DescribeSeverityLevelsResult, JsonUnmarshallerContext> {

    

    public DescribeSeverityLevelsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSeverityLevelsResult describeSeverityLevelsResult = new DescribeSeverityLevelsResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("severityLevels", targetDepth)) {
                    describeSeverityLevelsResult.setSeverityLevels(new ListUnmarshaller<SeverityLevel>(SeverityLevelJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return describeSeverityLevelsResult;
    }

    private static DescribeSeverityLevelsResultJsonUnmarshaller instance;
    public static DescribeSeverityLevelsResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DescribeSeverityLevelsResultJsonUnmarshaller();
        return instance;
    }
}
    