import static org.junit.Assert.*;

/**
 * Game的测试方法
 * Created by 李伟民 on 17/7/18.
 */
public class GameTest {
    @org.junit.Test
    public void play() throws Exception {
        Game game1=new Cricket();
        game1.play();

        Game game2=new Football();
        game2.play();
    }

}