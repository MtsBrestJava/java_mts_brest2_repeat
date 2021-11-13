package com.company.pkgx;

interface CarInterface {

    int i = 5;  // public static final
    float pi = 3.14f;

    void start();

    //private void llll();

    default void end() {
        System.out.println("Ending...");
    }

}
