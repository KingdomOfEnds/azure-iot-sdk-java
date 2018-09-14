 /*
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package tests.unit.com.microsoft.azure.sdk.iot.provisioning.security.hsm;

 import org.junit.Test;

 import static org.junit.Assert.fail;

 public class SecurityClientDiceTest
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
