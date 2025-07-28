package com.piggymetrics.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.commons.security.AccessTokenContextRelay;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;

@Configuration
public class AccessTokenContextRelayConfig {

    @Bean
    public AccessTokenContextRelay accessTokenContextRelay(DefaultOAuth2ClientContext clientContext) {
        return new AccessTokenContextRelay(clientContext);
    }
}