package Impl;

import Interface.Observer;
import Interface.Subject;


/**
 * Observer的实现类
 * Created by 李伟民 on 17/7/17.
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}