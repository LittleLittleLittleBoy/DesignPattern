import Impl.BinaryObserver;
import Impl.HexaObserver;
import Impl.OctalObserver;
import Interface.Subject;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 李伟民 on 17/7/17.
 */
public class SubjectTest {
    @Test
    public void test(){
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}