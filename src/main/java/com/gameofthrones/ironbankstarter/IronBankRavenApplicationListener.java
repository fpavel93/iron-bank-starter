package com.gameofthrones.ironbankstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class IronBankRavenApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Ворон полетел в "+ravenProperties.getDestination());
    }
}
