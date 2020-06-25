package com.artarkatesoft.maventesting;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit5HelloWorldTest {

    @Test
    public void getMessage() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello Art", javaHelloWorld.getMessage());

    }
}
