package ru.yandex.incoming34.FrenchVerbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.yandex.incoming34.FrenchVerbs.entity.Verb;
import ru.yandex.incoming34.FrenchVerbs.repository.VerbRepository;

@SpringBootApplication
public class FrenchVerbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrenchVerbsApplication.class, args);
		System.out.println("!!!!!!");

	}

}
