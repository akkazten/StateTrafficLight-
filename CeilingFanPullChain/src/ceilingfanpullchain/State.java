/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceilingfanpullchain;

/**
 *
 * @author Lenovo
 */
interface State {
    void pull(TrafficLight wrapper);
}

class TrafficLight {
    private State currentState;

    public TrafficLight() {
        currentState = new Off();
    }

    public void set_state(State s) {
        currentState = s;
    }

    public void pull() {
        currentState.pull(this);
    }
}

class Off implements State {
    public void pull(TrafficLight wrapper) {
        wrapper.set_state(new Yellow());
        System.out.println("Green light");
    }

}

class Yellow implements State {
    public void pull(TrafficLight wrapper) {
        wrapper.set_state(new Red());
        System.out.println("Yellow light");
    }

  
}

class Red implements State {
    public void pull(TrafficLight wrapper) {
        wrapper.set_state(new Green());
        System.out.println("Red ");
    }

}

class Green implements State {
    public void pull(TrafficLight wrapper) {
        wrapper.set_state(new Off());
        System.out.println("turning off");
    }

  
}


