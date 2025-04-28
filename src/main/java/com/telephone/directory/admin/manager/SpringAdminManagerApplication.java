package com.telephone.directory.admin.manager;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringAdminManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAdminManagerApplication.class, args);
    }

}
