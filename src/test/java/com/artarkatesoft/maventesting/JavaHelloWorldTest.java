package com.artarkatesoft.maventesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaHelloWorldTest {

    @Test
    public void getMessage() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello Art", javaHelloWorld.getMessage());

    }
}