package org.example.bobmer;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMS {
    // Your Account SID and Auth Token from twilio.com/console
    public static final String ACCOUNT_SID = "ACcc2087f810058ddf5c7c0e6cf57b3150";
    public static final String AUTH_TOKEN = "25a607350a069d6f4295773bc55d4c25";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        String messageBody = "Доброго дня, це Служба Безпеки України, судячи з вашої діяльності на сайті GumTree, " +
                "ми виявили шахрайську діяльність з вашого IP адресу, задля подальших дій та винесенню Вам вироку, ми навідаємо вас за адресою м. Хмельницький, вул. Панаса Мирного";
        for(int i=0; i<1; i++) {
            Message message = Message.creator(
                            new PhoneNumber("+380972796855"), // The mobile number you want to send the SMS to
                            new PhoneNumber("+15074835239"), // Your Twilio phone number
                            messageBody)
                    .create();

            System.out.println(message.getSid());
        }
    }
}

