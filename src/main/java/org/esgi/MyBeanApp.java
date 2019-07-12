package org.esgi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Guitarist guitarist = ctx.getBean(Guitarist.class);

        guitarist.play();

        ctx.close();
    }
}
