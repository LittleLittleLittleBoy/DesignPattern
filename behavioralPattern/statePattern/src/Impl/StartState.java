package Impl;

import Interface.State;
import main.Context;

/**
 * 接口的实现类
 * Created by 李伟民 on 17/7/18.
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}