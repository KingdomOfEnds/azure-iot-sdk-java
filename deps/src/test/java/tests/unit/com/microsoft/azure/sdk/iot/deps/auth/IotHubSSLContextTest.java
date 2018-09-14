// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package tests.unit.com.microsoft.azure.sdk.iot.deps.auth;

import com.microsoft.azure.sdk.iot.deps.auth.IotHubCertificateManager;
import com.microsoft.azure.sdk.iot.deps.auth.IotHubSSLContext;
import mockit.*;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;
import org.junit.Test;

import javax.net.ssl.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.UUID;

import static org.junit.Assert.*;

/*
 * Unit tests for IotHubSSLContext
 * Code Coverage:
 * Methods: 100%
 * Lines: 100%
 */
public class IotHubSSLContextTest
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
