package com.artarkatesoft.maventesting;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldJUnit4Test {

    @Test
    public void getMessage() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello Art", javaHelloWorld.getMessage());

    }
}