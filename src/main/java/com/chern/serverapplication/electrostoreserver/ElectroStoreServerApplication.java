package com.chern.serverapplication.electrostoreserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElectroStoreServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectroStoreServerApplication.class, args);
        System.out.println("Сервер успешно запущен.\n Порт: 8085");
    }

}
