package org.esgi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Aspect
public class BeforeAdvice {

    // Obtain a suitable logger.
    private static Log logger = LogFactory.getLog(BeforeAdvice.class);

    @Before("execution(* *.*(..)) && @annotation(testAnnotation) ")
    public void myBeforeLogger(JoinPoint joinPoint, TestAnnotation testAnnotation) {

        System.out.println("Okay - we're in the before handler...");
        System.out.println("The test annotation value is: " + testAnnotation.value());

        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        String stuff = signature.toString();
        String arguments = Arrays.toString(joinPoint.getArgs());
        logger.info("Write something in the log... We are just about to call method: "
                + methodName + " with arguments " + arguments + "\nand the full toString: "
                + stuff);


        System.out.println("Write something in the log... We are just about to call method: "
                + methodName + " with arguments " + arguments + "\nand the full toString: "
                + stuff);

    }

}