package com.daggerok.discoveryserviceregistry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(EurekaServer.class)
public class EurekaServerTests {

    @Test
    public void contextLoads() {}
}
