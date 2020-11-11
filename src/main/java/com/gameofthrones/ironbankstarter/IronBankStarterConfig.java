package com.gameofthrones.ironbankstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronBankStarterConfig {
    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty(value = "raven.destination")
    public IronBankRavenApplicationListener ravenApplicationListener(){
        return  new IronBankRavenApplicationListener();
    }
}
