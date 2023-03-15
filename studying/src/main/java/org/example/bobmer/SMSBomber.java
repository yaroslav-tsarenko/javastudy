package org.example.bobmer;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.util.Arrays;
import java.util.List;

public class SMSBomber {
    // Your Account SID and Auth Token from twilio.com/console
    public static final String ACCOUNT_SID = "ACcc2087f810058ddf5c7c0e6cf57b3150";
    public static final String AUTH_TOKEN = "25a607350a069d6f4295773bc55d4c25";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        List<String> phoneNumbers = Arrays.asList(
                "+380674954273",
                "+380980679160",
                "+380972796855"
        ); // Add your list of phone numbers here

        String messageBody = "Here is your approved code: XYZ123";
        int numMessages = 2; // Number of times to send the message

        for (int i = 0; i < numMessages; i++) {
            for (String phoneNumber : phoneNumbers) {
                Message message = Message.creator(
                                new PhoneNumber(phoneNumber), // The mobile number you want to send the SMS to
                                new PhoneNumber("+15074835239"), // Your Twilio phone number
                                messageBody)
                        .create();

                System.out.println("Message SID: " + message.getSid() + ", To: " + phoneNumber);
            }
        }

        System.out.println("Messages sent: " + (phoneNumbers.size() * numMessages));
    }
}
