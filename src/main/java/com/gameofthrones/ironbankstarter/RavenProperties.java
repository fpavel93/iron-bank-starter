package com.gameofthrones.ironbankstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "raven")
@Data
public class RavenProperties {
    private String destination;
    private String name;
}
