package org.jbugkorea.hello;

/**
 * HelloA -> HelloB
 */
public class HelloA {
    public void say() {
        System.out.println("HelloA!");
        new HelloB().say();
    }
}