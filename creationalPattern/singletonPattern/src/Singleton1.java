/**
 * Created by 李伟民 on 17/7/11.
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){

    }

    public static synchronized Singleton1 getInstance(){
        if (instance==null){
            instance=new Singleton1();
        }
        return instance;
    }

}
