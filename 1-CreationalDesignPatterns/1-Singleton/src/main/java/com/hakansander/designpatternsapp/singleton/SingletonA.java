package com.hakansander.designpatternsapp.singleton;

public class SingletonA {
    private static SingletonA singletonA;

    private SingletonA() {};

    public static SingletonA getSingletonA() {

        //if the signletonA is already created, there is no need to acquire a block and wait for the other threads so that synchronized block is created inside
        if(singletonA == null) {
            synchronized (SingletonA.class) {
                if(singletonA == null) {
                    singletonA = new SingletonA();
                }
            }
        }

        return singletonA;
    }
}
