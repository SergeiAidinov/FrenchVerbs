package ru.yandex.incoming34.FrenchVerbs.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import ru.yandex.incoming34.FrenchVerbs.service.MainService;
import ru.yandex.incoming34.FrenchVerbs.entity.Verb;

@SpringBootTest
class VerbRepositoryTest {

    @Autowired
    @Qualifier("mainservice")
    MainService mainService;

    @Autowired
    VerbRepository verbRepository;

    @Test
    public void test(){
        Iterable<Verb> iterableVerb = mainService.find();
        System.out.println(iterableVerb);

        Verb verb = verbRepository.findByInfinitive("aller");
        System.out.println(verb);

    }


}