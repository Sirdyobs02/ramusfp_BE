package com.playground.ramusfp.event.listener;

import com.playground.ramusfp.entity.User;
import com.playground.ramusfp.event.RegistrationCompleteEvent;
import com.playground.ramusfp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        //Create the verification token for the user
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        userService.saveVerificationTokenForUser(token,user);
        //Send mail to user
        String url = event.getApplicationUrl()
                + "verifyRegistration?token="
                + token;

        //send verificationEmail()
        log.info("Click the link to verify your account: {}", url);
    }
}
