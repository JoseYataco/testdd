package pe.edu.cibertec.demofeignclient.restclient.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.apache.coyote.RequestInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignInterceptorConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                requestTemplate.header("Authorization",
                        "Bearer "+"..");
            }
        };
    }

}
