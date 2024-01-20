package com.example.avionservice;

import com.example.avionservice.dao.entities.Avion;
import com.example.avionservice.dao.repositories.AvionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AvionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvionServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AvionRepository avionRepository) {
        return args -> {
            List<Avion> avionList = List.of(
                    Avion.builder().model("Model1").color("Red").matricule("ABC123").price(20000.0f).build(),
                    Avion.builder().model("Model2").color("Blue").matricule("XYZ456").price(25000.0f).build(),
                    Avion.builder().model("Model3").color("Green").matricule("DEF789").price(18000.0f).build(),
                    Avion.builder().model("Model4").color("Black").matricule("GHI101").price(30000.0f).build(),
                    Avion.builder().model("Model5").color("White").matricule("JKL112").price(22000.0f).build()
            );
            avionRepository.saveAll(avionList);
        };
    }
}