package br.com.tech4me.pessoasms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PessoasMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PessoasMsApplication.class, args);
	}

}
