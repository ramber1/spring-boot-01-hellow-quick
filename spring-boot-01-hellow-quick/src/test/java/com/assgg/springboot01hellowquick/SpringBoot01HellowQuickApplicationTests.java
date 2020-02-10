package com.assgg.springboot01hellowquick;

import com.assgg.springboot01hellowquick.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot01HellowQuickApplicationTests {
    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;

    public void contextLoads() {
        System.out.println(person);
    }
    @Test
    public void Zairu(){
        boolean bool=ioc.containsBean("sayHellowService");
        System.out.println("是否包含bean:"+bool);
    }

}
