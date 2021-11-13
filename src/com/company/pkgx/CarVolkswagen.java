package com.company.pkgx;

public class CarVolkswagen extends HumanX implements CarInterface, SomeInterface {


    @Override
    public void start() {
        System.out.println("Volkswagen starting 0-100: 5s");
    }

    @Override
    public void end() {

    }

    @Override
    void someM() {

    }
}
