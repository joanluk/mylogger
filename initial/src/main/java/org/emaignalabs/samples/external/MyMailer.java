package org.emaignalabs.samples.external;

import java.text.MessageFormat;


public class MyMailer {
    public void sendToSysAdmin(String message) {
        System.out.println(MessageFormat.format("Send mail with message: {0}",  message));
    }
}
