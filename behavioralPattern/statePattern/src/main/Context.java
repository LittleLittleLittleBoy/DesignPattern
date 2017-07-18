package main;

import Interface.State;

/**
 * Created by 李伟民 on 17/7/18.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
