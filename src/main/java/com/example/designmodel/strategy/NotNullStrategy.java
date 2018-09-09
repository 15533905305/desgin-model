package com.example.designmodel.strategy;


import com.example.designmodel.exceptions.StrategyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author junli wang
 * @date ${date}
 */
public class NotNullStrategy implements VerifyStrategy {

    private Logger logger = LoggerFactory.getLogger(NotNullStrategy.class);

    @Override
    public void verify() {
        logger.info("logger info join not null ");
        System.out.println("join not null method");
//        throw new StrategyException("自定义异常!");
        throw new RuntimeException("自定义异常!");
    }
}
