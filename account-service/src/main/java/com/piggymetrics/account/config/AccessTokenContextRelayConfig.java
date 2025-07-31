package com.piggymetrics.account.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.commons.security.AccessTokenContextRelay;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;

@Configuration
public class AccessTokenContextRelayConfig {

    @Autowired
    private OAuth2RestTemplate oAuth2RestTemplate;

    @Bean
    public AccessTokenContextRelay accessTokenContextRelay() {
        return new AccessTokenContextRelay((OAuth2ClientContext) oAuth2RestTemplate);
    }
}