package com.artarkatesoft.maventesting;

public class JavaHelloWorldTest {

    public void testGetMessage() {
        System.out.println("1");
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert ("Hello Art".equals(javaHelloWorld.getMessage()));
    }

    public void testGetMessageFailure() {
        System.out.println("2");
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert ("Hello Art1".equals(javaHelloWorld.getMessage()));
    }

    public void willNotRunTest() {
        System.out.println("3 - will not run");
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert ("Hello Art11111".equals(javaHelloWorld.getMessage()));
    }


}