/**
 * Created by 李伟民 on 17/7/11.
 */
public class Singleton2 {
    private volatile static Singleton2 instance;
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        if (instance==null){
            synchronized (Singleton2.class){
                if (instance==null){
                    instance=new Singleton2();
                }
            }
        }
        return instance;
    }
}
