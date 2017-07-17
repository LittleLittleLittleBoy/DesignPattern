package Impl;

import Interface.Observer;
import Interface.Subject;

/**
 * Observer的实现类
 * Created by 李伟民 on 17/7/17.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}