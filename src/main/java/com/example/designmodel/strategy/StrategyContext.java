package com.example.designmodel.strategy;/*
 * @author junli wang
 * @date ${date}
 **/

public class StrategyContext {

    VerifyStrategy verifyStrategy;


    public void verify() {
        this.verifyStrategy.verify();
    }

    public VerifyStrategy getVerifyStrategy() {
        return verifyStrategy;
    }

    public void setVerifyStrategy(VerifyStrategy verifyStrategy) {
        this.verifyStrategy = verifyStrategy;
    }
}
