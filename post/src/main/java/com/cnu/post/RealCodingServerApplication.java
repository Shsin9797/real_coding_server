package com.cnu.real_coding_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RealCodingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RealCodingServerApplication.class, args);
    }

}
