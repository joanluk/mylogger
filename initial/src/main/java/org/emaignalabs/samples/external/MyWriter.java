package org.emaignalabs.samples.external;

import java.text.MessageFormat;


public class MyWriter {

    public void writeToLog(String message) {
        System.out.println(MessageFormat.format("Log with message: {0}", message));
    }
}
