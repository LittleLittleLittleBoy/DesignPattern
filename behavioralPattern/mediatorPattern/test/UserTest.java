import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 使用 User 对象来显示他们之间的通信。
 * Created by 李伟民 on 17/7/18.
 */
public class UserTest {
    @Test
    public void test(){
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}