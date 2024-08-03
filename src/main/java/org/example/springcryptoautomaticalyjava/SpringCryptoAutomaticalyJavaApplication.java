package org.example.springcryptoautomaticalyjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCryptoAutomaticalyJavaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringCryptoAutomaticalyJavaApplication.class, args);
        SpringApplication.exit(run);
    }

}
