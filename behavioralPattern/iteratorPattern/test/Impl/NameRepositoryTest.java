package Impl;

import Interface.Container;
import Interface.Iterator;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 李伟民 on 17/7/12.
 */
public class NameRepositoryTest {
    @Test
    public void getIterator() throws Exception {
        Container container=new NameRepository();
        Iterator iterator=container.getIterator();

        do{
            System.out.println(iterator.next());
        }while (iterator.hasNext());
    }

}