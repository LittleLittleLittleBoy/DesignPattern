package Impl.computerVistor;

import Impl.computerPart.Computer;
import Impl.computerPart.Keyboard;
import Impl.computerPart.Monitor;
import Impl.computerPart.Mouse;
import Interface.ComputerPartVisitor;

/**
 * Created by 李伟民 on 17/7/18.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
