package br.com.dom.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"br.com.dom.core.model"})
@EnableJpaRepositories({"br.com.dom.data"})
public class SisgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SisgeApplication.class, args);
    }

}
