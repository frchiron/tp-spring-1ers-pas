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

//    @Pointcut("execution(* org.esgi.*.*(..))")
@Pointcut("execution(* org.esgi.*.play(..))")
    public void k() {
    }

    @Before("k()")
    public void logBefore() {
        System.out.println("on passe par l'aspect créé par Freddy");
    }

    @After("execution(* *.*(..))")
    public void logAfter() {
        System.out.println("apres 'aspect créé par Freddy");
    }


}
