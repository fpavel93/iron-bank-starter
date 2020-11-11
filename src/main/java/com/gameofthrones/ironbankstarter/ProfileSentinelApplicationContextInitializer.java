package com.gameofthrones.ironbankstarter;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import static com.gameofthrones.ironbankstarter.ProfilesConst.ЗИМА_БЛИЗКО;
import static com.gameofthrones.ironbankstarter.ProfilesConst.ЗИМА_ТУТА;

public class ProfileSentinelApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        if(environment.getActiveProfiles().length == 0){
            throw new БезПрофиляНизяException("либо "+ЗИМА_ТУТА+" либо "+ЗИМА_БЛИЗКО);
        }
    }
}
