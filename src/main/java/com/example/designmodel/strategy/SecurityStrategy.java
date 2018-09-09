package com.example.designmodel.strategy;/*
 * @author junli wang
 * @date ${date}
 **/

public class SecurityStrategy implements VerifyStrategy {
    @Override
    public void verify() {
        System.out.println("join not security method");
    }
}
