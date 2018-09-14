/*
 *
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 *
 */

package tests.unit.com.microsoft.azure.sdk.iot.provisioning.security.hsm;

import com.microsoft.azure.sdk.iot.provisioning.security.exceptions.SecurityProviderException;
import com.microsoft.azure.sdk.iot.provisioning.security.hsm.SecurityProviderDiceEmulator;
import com.microsoft.msr.RiotEmulator.RIoT;
import mockit.Deencapsulation;
import mockit.Mocked;
import org.junit.Test;

import java.security.Key;
import java.security.cert.X509Certificate;
import java.util.Collection;

import static junit.framework.TestCase.*;
import static org.junit.Assert.fail;

/*
 * Unit tests for SecurityProviderDiceEmulator
 * Coverage - 100% line, 100% method
 */
public class SecurityProviderDiceEmulatorTest
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
