package Interface;

import Impl.computerPart.Computer;
import Impl.computerVistor.ComputerPartDisplayVisitor;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 李伟民 on 17/7/18.
 */
public class ComputerPartVisitorTest {
    @Test
    public void test(){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}