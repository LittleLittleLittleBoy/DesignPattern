import java.util.Date;

/**
 * 中介类
 * Created by 李伟民 on 17/7/18.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
