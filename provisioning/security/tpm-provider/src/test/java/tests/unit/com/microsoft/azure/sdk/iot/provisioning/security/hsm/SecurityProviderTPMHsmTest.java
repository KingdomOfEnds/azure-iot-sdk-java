/*
 *
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 *
 */

package tests.unit.com.microsoft.azure.sdk.iot.provisioning.security.hsm;

import com.microsoft.azure.sdk.iot.provisioning.security.exceptions.SecurityProviderException;
import com.microsoft.azure.sdk.iot.provisioning.security.hsm.SecurityProviderTPMHsm;
import mockit.*;
import org.junit.Test;
import tss.InByteBuf;
import tss.Tpm;
import tss.TpmFactory;
import tss.TpmHelpers;
import tss.tpm.*;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/*
 *  Unit tests for  SecurityProviderTPMHsm
 *  Coverage : 100% Method, 100% Lines
 */

public class SecurityProviderTPMHsmTest
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
