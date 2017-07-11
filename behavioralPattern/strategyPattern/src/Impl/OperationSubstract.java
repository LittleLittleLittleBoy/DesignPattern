package Impl;

import Interface.Strategy;

/**
 * 策略具体实现类
 * Created by 李伟民 on 17/7/11.
 */
public class OperationSubstract implements Strategy {
    public int doOperation(int a, int b) {
        return a-b;
    }
}
