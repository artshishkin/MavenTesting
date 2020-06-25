package com.artarkatesoft.maventesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaHelloWorldIT {

    @Test
    void fakeIntegrationTest() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello Art", javaHelloWorld.getMessage());

    }
}
