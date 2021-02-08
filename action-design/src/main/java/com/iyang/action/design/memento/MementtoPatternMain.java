package com.iyang.action.design.memento;

/**
 * Created by Yang on 2021/2/8 22:29
 */

public class MementtoPatternMain {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State : " + originator.getState());

        originator.setStateFromMemento(careTaker.get(0));
        System.out.println("First saved state : " + originator.getState());

        originator.setStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State : " + originator.getState());

    }

}
