package org.esgi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scene {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");



        ctx.close();
    }
}
