package org.jbugkorea.app;

import org.jbugkorea.hello.Hello;

public class Main {
    public static void main(String[] args) {

        new Hello().say();

        // wait infinitely
        synchronized (Main.class) {
            try {
                Main.class.wait();
            } catch (InterruptedException e) {
            }
        }
    }
}