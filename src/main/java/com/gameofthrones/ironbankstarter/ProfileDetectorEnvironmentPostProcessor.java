package com.gameofthrones.ironbankstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class ProfileDetectorEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if(environment.getActiveProfiles().length == 0){
            if(холодно()){
                environment.addActiveProfile(ProfilesConst.ЗИМА_ТУТА);
            }
            else {
                environment.setActiveProfiles(ProfilesConst.ЗИМА_БЛИЗКО);
            }
        }
    }

    private boolean холодно() {
        return true;
    }
}
