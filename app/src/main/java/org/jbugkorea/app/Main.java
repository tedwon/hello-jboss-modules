package org.jbugkorea.app;

import org.jbugkorea.hello.HelloA;
import org.jbugkorea.hello.HelloB;

/**
 * Main -> HelloA -> HelloB
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Main!");

        new HelloB().say();


//        new Hello().say();
        new HelloA().say();

        // wait infinitely
        synchronized (Main.class) {
            try {
                Main.class.wait();
            } catch (InterruptedException e) {
            }
        }
    }
}