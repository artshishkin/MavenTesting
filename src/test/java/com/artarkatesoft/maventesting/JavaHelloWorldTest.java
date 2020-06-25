package com.artarkatesoft.maventesting;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JavaHelloWorldTest {

    @Test
    public void testGetMessage() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals(javaHelloWorld.getMessage(),"Hello Art");
    }
}
