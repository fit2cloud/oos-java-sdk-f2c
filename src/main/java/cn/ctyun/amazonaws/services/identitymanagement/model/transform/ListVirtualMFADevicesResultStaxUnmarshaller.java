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

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import cn.ctyun.amazonaws.services.identitymanagement.model.*;
import cn.ctyun.amazonaws.transform.MapEntry;
import cn.ctyun.amazonaws.transform.StaxUnmarshallerContext;
import cn.ctyun.amazonaws.transform.Unmarshaller;
import cn.ctyun.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * List Virtual M F A Devices Result StAX Unmarshaller
 */
public class ListVirtualMFADevicesResultStaxUnmarshaller implements Unmarshaller<ListVirtualMFADevicesResult, StaxUnmarshallerContext> {

    public ListVirtualMFADevicesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListVirtualMFADevicesResult listVirtualMFADevicesResult = new ListVirtualMFADevicesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return listVirtualMFADevicesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("VirtualMFADevices/member", targetDepth)) {
                    listVirtualMFADevicesResult.getVirtualMFADevices().add(VirtualMFADeviceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IsTruncated", targetDepth)) {
                    listVirtualMFADevicesResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Marker", targetDepth)) {
                    listVirtualMFADevicesResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listVirtualMFADevicesResult;
                }
            }
        }
    }

    private static ListVirtualMFADevicesResultStaxUnmarshaller instance;
    public static ListVirtualMFADevicesResultStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ListVirtualMFADevicesResultStaxUnmarshaller();
        return instance;
    }
}
    