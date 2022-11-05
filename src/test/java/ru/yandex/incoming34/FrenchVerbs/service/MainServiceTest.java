package ru.yandex.incoming34.FrenchVerbs.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.yandex.incoming34.FrenchVerbs.entity.Verb;
import ru.yandex.incoming34.FrenchVerbs.service.MainService;

@Component
//@RunWith(SpringJUnit4ClassRunner.class)
public class MainServiceTest {

    //@Autowired
    private MainService mainService;

    @Autowired
    MainServiceTest(MainService mainService) {
        this.mainService = mainService;
    }



    @Test
    public void test(){
        Iterable<Verb> l = mainService.find();
        System.out.println(l);
    }



}