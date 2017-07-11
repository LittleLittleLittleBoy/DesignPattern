import Impl.OperationAdd;
import Impl.OperationMultiply;
import Impl.OperationSubstract;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 李伟民 on 17/7/11.
 */
public class ContextTest {
    @Test
    public void testAdd(){
        Context content=new Context(new OperationAdd());
        assertEquals(15,content.execute(10,5));
    }
    @Test
    public void testSubstract(){
        Context content=new Context(new OperationSubstract());
        assertEquals(5,content.execute(10,5));
    }
    @Test
    public void testMultiply(){
        Context content=new Context(new OperationMultiply());
        assertEquals(50,content.execute(10,5));
    }

}