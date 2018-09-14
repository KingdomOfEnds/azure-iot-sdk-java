/*
 *
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 *
 */

package tests.unit.com.microsoft.azure.sdk.iot.provisioning.device;

import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.fail;

/*
    Unit tests for ProvisioningDeviceClient
    Coverage : 100% methods, 100% lines
 */

@RunWith(JMockit.class)
public class ProvisioningDeviceClientTest
{
    @Test
    public void flakeyTest()
    {
        double rand = Math.random() * 3 + 1; //between 4 and 1

        if (rand >= 2)
        {
            fail("bad luck, compadre");
        }
    }
}
