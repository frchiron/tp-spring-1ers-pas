package org.esgi;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
//@EnableAspectJAutoProxy
@Aspect
public class AspectArtist {

// defining pointcut

//    @Pointcut("execution(* *.*(..))")
    @Pointcut("execution(* org.esgi.*.*(..))")
    public void k() {
    }//pointcut name

    //    @Before("execution(public * *(..))")
//    @Before("execution(public String play())")
    @Before("k()")
    public void logBefore() {
        System.out.println("on passe par l'aspect");
    }

    @After("execution(* *.*(..))")
    public void logAfter() {
        System.out.println("apres 'aspect");
    }


}
