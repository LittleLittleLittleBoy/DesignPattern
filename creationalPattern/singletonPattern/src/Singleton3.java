/**
 * Created by 李伟民 on 17/7/11.
 */
public class Singleton3 {
    private Singleton3(){

    }

    public static final Singleton3 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static final Singleton3 INSTANCE=new Singleton3();
    }
}
