package Impl;

import Interface.State;
import main.Context;

/**
 * Created by 李伟民 on 17/7/18.
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}