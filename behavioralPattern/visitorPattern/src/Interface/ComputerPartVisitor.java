package Interface;

import Impl.computerPart.Computer;
import Impl.computerPart.Keyboard;
import Impl.computerPart.Monitor;
import Impl.computerPart.Mouse;

/**
 * 访问者接口
 * Created by 李伟民 on 17/7/18.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
