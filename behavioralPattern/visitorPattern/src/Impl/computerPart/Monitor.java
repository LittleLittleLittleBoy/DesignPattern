package Impl.computerPart;

import Interface.ComputerPart;
import Interface.ComputerPartVisitor;

/**
 * Created by 李伟民 on 17/7/18.
 */
public class Monitor implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
