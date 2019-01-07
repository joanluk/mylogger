package org.emaignalabs.samples.external;


import java.text.MessageFormat;

public class MySms {

    public void sendToSysAdmin(String message) {
        System.out.println(MessageFormat.format("Send sms with message: {0}",  message));
    }
}
