package com.adsonsa.gofpadra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Classe principal da aplicação.
 *
 * @version 1.0
 * @since 2021-04-09
 * os seguintes módulos são importados Spring Initializr:
 * - Spring Web
 * - Spring Data JPA
 * - H2 Database
 * -OpenFeign
 * - Open IA swagger
 * @author Adson-C
 */

@EnableFeignClients
@SpringBootApplication
public class GofPadraApplication {

	public static void main(String[] args) {
		SpringApplication.run(GofPadraApplication.class, args);
	}

}
