package com.jobportal.jobportal.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    public static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution (* com.jobportal.jobportal.service.JobService.*(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        LOGGER.info("Method Called: " + joinPoint.getSignature().getName());
    }
}
