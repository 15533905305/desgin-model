package com.example.designmodel;

import com.example.designmodel.singleton.Singleton;
import com.example.designmodel.strategy.NotNullStrategy;
import com.example.designmodel.strategy.SecurityStrategy;
import com.example.designmodel.strategy.StrategyContext;
import com.example.designmodel.strategy.VerifyStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignModelApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSingleton() {
        Singleton instance = Singleton.getInstance();
        instance.setUserName("test");
        Assert.assertEquals("test", instance.getUserName());
    }


    @Test
    public void testStrategy() {
        StrategyContext strategyContext = new StrategyContext();
        strategyContext.setVerifyStrategy(new NotNullStrategy());
        strategyContext.verify();
        strategyContext.setVerifyStrategy(new SecurityStrategy());
        strategyContext.verify();
    }

    @Test
    public void testException() {
        throw new RuntimeException("sfgsdfg");
    }

}
