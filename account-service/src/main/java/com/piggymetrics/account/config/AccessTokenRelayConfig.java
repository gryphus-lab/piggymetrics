package com.piggymetrics.account.config;

import org.springframework.cloud.commons.security.AccessTokenContextRelay;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;

@Configuration
public class AccessTokenRelayConfig {

    @Bean
    public AccessTokenContextRelay accessTokenContextRelay(OAuth2RestTemplate oAuth2RestTemplate) {
        return new AccessTokenContextRelay((OAuth2ClientContext) oAuth2RestTemplate);
    }
}