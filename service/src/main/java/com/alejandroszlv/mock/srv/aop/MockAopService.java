/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.srv.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Alex
 */
@Aspect
@Component
public class MockAopService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MockAopService.class);

    @Before("within(com.alejandroszlv.mock.srv..*)")
    public void inRestController(JoinPoint joinPoint) {
        LOGGER.info("Start {}", joinPoint.getStaticPart().toString());
    }
    
    @After("within(com.alejandroszlv.mock.srv..*)")
    public void afterRestController(JoinPoint joinPoint) {
        LOGGER.info("End {}", joinPoint.getStaticPart().toString());
    }
    
    @AfterReturning(
            pointcut = "within(com.alejandroszlv.mock.srv..*)",
            returning = "retVal")
    public void afterReturning(JoinPoint joinPoint, Object retVal) {
        LOGGER.info("Return {}", retVal);
    }
    
    @AfterThrowing(
            pointcut = "within(com.alejandroszlv.mock.srv..*)",
            throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Throwable e) {
        LOGGER.error(e.getMessage(), e);      
    }

}
