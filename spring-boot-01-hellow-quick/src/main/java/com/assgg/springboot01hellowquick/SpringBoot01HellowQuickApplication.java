package com.assgg.springboot01hellowquick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:beans.xml")
@SpringBootApplication
public class SpringBoot01HellowQuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01HellowQuickApplication.class, args);
    }

}
