package org.emaignalabs.samples;


import org.emaignalabs.samples.external.MyMailer;
import org.emaignalabs.samples.external.MySms;
import org.emaignalabs.samples.external.MyWriter;


public class MyLogger {

    private static  final Integer LOG = 0;
    private static final Integer WARNING = 1;
    private static final Integer CRITICAL = 2;

    public void log(Integer type, String message) {

        switch (type) {
            case 0 :
                MyWriter log = new MyWriter();
                log.writeToLog(message);
                break;
            case 1:
                MyMailer mailer = new MyMailer();
                mailer.sendToSysAdmin(message);
                MyWriter log2 = new MyWriter();
                log2.writeToLog(message);
                break;
            case 2:
                MySms sms = new MySms();
                sms.sendToSysAdmin(message);
                MyMailer mailer3 = new MyMailer();
                mailer3.sendToSysAdmin(message);
                MyWriter log3 = new MyWriter();
                log3.writeToLog(message);
                break;
                
        }
    }

    public static void main(String[] args) {
        MyLogger myLogger = new MyLogger();

        myLogger.log(LOG, "log message");
        myLogger.log(WARNING, "warning message");
        myLogger.log(CRITICAL, "critical message");
        
    }
}
