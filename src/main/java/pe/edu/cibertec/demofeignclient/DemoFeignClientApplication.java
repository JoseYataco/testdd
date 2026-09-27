package pe.edu.cibertec.demofeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFeignClientApplication.class, args);
    }

}
