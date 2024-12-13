package org.globant.talentodigital.telefonica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TelefonicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelefonicaApplication.class, args);
    }

}
