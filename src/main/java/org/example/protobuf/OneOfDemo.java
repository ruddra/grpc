package org.example.protobuf;

import org.example.models.Credentials;
import org.example.models.EmailCredentials;
import org.example.models.PhoneOTP;

public class OneOfDemo {
    public static void main(String[] args) {
        EmailCredentials email = EmailCredentials.newBuilder()
                .setEmail("asdasd@asd.com")
                .setPassword("aaaa")
                .build();
        PhoneOTP phone = PhoneOTP.newBuilder()
                .setCode(1234)
                .setNumber(1234)
                .build();

        Credentials credentials = Credentials.newBuilder()
                .setPhoneMode(phone)
                .build();

        login(credentials);
    }

    private static void login(Credentials credentials) {
        switch (credentials.getModeCase()){
            case EMAILMODE:
                System.out.println(credentials.getEmailMode());
                break;
            case PHONEMODE:
                System.out.println(credentials.getPhoneMode());
        }

    }
}
