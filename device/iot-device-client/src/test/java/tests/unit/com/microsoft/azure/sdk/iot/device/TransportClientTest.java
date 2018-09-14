package tests.unit.com.microsoft.azure.sdk.iot.device;

import com.microsoft.azure.sdk.iot.device.*;
import com.microsoft.azure.sdk.iot.device.auth.IotHubSasTokenAuthenticationProvider;
import com.microsoft.azure.sdk.iot.device.exceptions.TransportException;
import com.microsoft.azure.sdk.iot.device.transport.NoRetry;
import com.microsoft.azure.sdk.iot.device.transport.RetryPolicy;
import mockit.Deencapsulation;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Verifications;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Unit tests for TransportClient.
 * Methods: 100%
 * Lines: 96%
 */
public class TransportClientTest
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
