package io.lbertel.demo.shared.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "economicpayment")
public class MapQueueYmlFile {

    //the name is import. Convention over configurations
    private Map<String, String> oipa;

    public Map<String, String> getOipa() {
        return oipa;
    }

    public void setOipa(Map<String, String> oipa) {
        this.oipa = oipa;
    }
}
