package com.artarkatesoft.maventesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {


    private JavaHelloWorld javaHelloWorld;

    @Before
    public void setUp() throws Exception {
        javaHelloWorld = new JavaHelloWorld();
    }

    @Test
    public void getMessage() {
        assertEquals("Hello Art",javaHelloWorld.getMessage());
    }
    @Test
    public void getMessageNotEquals() {
        assertNotEquals("Hello World",javaHelloWorld.getMessage());
    }
}