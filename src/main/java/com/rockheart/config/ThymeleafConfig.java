package com.rockheart.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;

@Configurable
@Component
public class ThymeleafConfig {
    private static final Charset DEFAULT_ENCODING = Charset.defaultCharset();
    public static final String DEFAULT_PREFIX = "classpath:/template/";
    public static final String DEFAULT_SUFFIX = ".html";

    @Bean
    public ThymeleafProperties getThymeleafProperties(){
        ThymeleafProperties thymeleafProperties = new ThymeleafProperties();
        thymeleafProperties.setCache(false);
        thymeleafProperties.setEncoding(DEFAULT_ENCODING);
        thymeleafProperties.setPrefix(DEFAULT_PREFIX);
        thymeleafProperties.setSuffix(DEFAULT_SUFFIX);
        return thymeleafProperties;
    }


}
