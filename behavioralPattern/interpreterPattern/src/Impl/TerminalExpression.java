package Impl;

import Interface.Expression;

/**
 * 实现了表达式接口的实体类
 * Created by 李伟民 on 17/7/18.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    public boolean interpret(String context) {
        return context.contains(data);
    }
}
