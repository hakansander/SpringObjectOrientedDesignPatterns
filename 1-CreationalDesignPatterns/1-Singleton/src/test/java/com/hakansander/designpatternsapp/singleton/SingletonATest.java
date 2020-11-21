package com.hakansander.designpatternsapp.singleton;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SingletonATest {

    /*
    If you try to initialize in the same way below,
    then you are going to get no beans found error because
    we have prevented this initialization way by making our
    constructor private
    @Autowired
    SingletonA singletonA;
     */

    @Test
    public void testSingletons(){
        SingletonA singletonA1 = SingletonA.getSingletonA();
        SingletonA singletonA2 = SingletonA.getSingletonA();

        //You can see below that the both of them points out to the same memory (therefore same object)
        System.out.println(singletonA1);
        System.out.println(singletonA2);

        Assert.assertNotNull(singletonA1);
        Assert.assertNotNull(singletonA2);

        Assert.assertSame(singletonA1, singletonA2);
    }
}
