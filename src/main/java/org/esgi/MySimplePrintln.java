package org.esgi;

import org.esgi.TestAnnotation;
import org.springframework.stereotype.Component;

@Component
public class MySimplePrintln {

    /**
     * Print a message
     */
    @TestAnnotation(value = "Roger")
    public void println(String arg0) {
        System.out.println(arg0);
    }

    public static void main(String[] args) {
        MySimplePrintln mySimplePrintln = new MySimplePrintln();
        mySimplePrintln.println("dqdqs");
    }
}