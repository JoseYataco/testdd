package com.example.demofeingclient.restclient.config;


import com.example.demofeingclient.restclient.errorhandler.CustomErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class FeingConfig {

@Bean
    public ErrorDecoder errorDecoder(){
    return new CustomErrorDecoder();
    }

}
