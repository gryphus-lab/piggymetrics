package com.piggymetrics.notification.service;

import com.piggymetrics.notification.domain.NotificationType;
import com.piggymetrics.notification.domain.Recipient;

import java.io.IOException;

public interface EmailService {

    void send(NotificationType type, Recipient recipient, String attachment) throws IOException, javax.mail.MessagingException;

}
