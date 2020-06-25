package com.artarkatesoft.maventesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaHelloWorldTest {

    @Test
    void getMessage() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello Art", javaHelloWorld.getMessage());

    }
}