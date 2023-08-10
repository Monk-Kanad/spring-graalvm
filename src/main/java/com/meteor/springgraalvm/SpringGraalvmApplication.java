package com.meteor.springgraalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringGraalvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGraalvmApplication.class, args);
	}

}

@RestController
class HelloController{

	@GetMapping("/hello")
	public Flux<String> hello(){
		return Flux.just("A  ","B ","C  ", "D ").log();
	}
}
