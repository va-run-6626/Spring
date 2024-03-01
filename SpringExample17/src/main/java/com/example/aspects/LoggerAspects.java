package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;
@Component
@Aspect
@Order(2)
public class LoggerAspects {
    private  Logger logger = Logger.getLogger(LoggerAspects.class.getName());
    @Around("execution(* com.example.serivices.*.*(..))")
    public String log(ProceedingJoinPoint joinPoint) throws  Throwable{
        logger.info(joinPoint.getSignature().toString() + "method execution started");
        Instant start = Instant.now();
        String obj = (String) joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);
        logger.info(joinPoint.getSignature().toString() + "method execution end");
        return obj;
    }
    @Around("@annotation(com.example.interfaces.LogAspect)")
    public String logWithAnnotation(ProceedingJoinPoint joinPoint) throws  Throwable{
        logger.info(joinPoint.getSignature().toString() + "method execution started");
        Instant start = Instant.now();
        String obj = (String) joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);
        logger.info(joinPoint.getSignature().toString() + "method execution end");
        return obj;
    }

    @AfterThrowing(value = "execution(* com.example.services.*.*(..))",throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) {
        logger.log(Level.SEVERE,joinPoint.getSignature()+ " An exception thrown with the help of" +
                " @AfterThrowing which happened due to : "+ex.getMessage());
    }

    @AfterReturning(value = "execution(* com.example.services.*.*(..))",returning = "retVal")
    public void logStatus(JoinPoint joinPoint,Object retVal) {
        logger.log(Level.INFO,joinPoint.getSignature()+ " Method successfully processed with the status " +
                retVal.toString());
    }

}
