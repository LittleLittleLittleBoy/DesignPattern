import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李伟民 on 17/7/18.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}