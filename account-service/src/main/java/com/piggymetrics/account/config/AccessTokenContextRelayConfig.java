package com.piggymetrics.account.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.commons.security.AccessTokenContextRelay;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccessTokenContextRelayConfig {

    @Autowired
    private AccessTokenContextRelay relay;

    @Bean
    public AccessTokenContextRelay accessTokenContextRelay() {
        return relay;
    }
}