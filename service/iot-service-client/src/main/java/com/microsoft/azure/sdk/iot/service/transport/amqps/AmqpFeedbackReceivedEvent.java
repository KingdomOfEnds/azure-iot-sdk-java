/*
 * Copyright (c) Microsoft. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.microsoft.azure.sdk.iot.service.transport.amqps;

public interface AmqpFeedbackReceivedEvent
{
    public void onFeedbackReceived(String feedbackJson);
}
