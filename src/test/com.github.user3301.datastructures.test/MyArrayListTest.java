package Test;

import com.github.user3301.datastructures.List.ArrayList.MyArrayList;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;


/** MyArrayList Junit test
 * Created by User3301 on 21/5/17.
 */
public class MyArrayListTest {

    @Test
    public void isEmptyTest() {
        MyArrayList myArrayList = new MyArrayList();
        assertEquals(true,myArrayList.isEmpty());
        myArrayList.add(new Integer(1));
        assertEquals(false,myArrayList.isEmpty());
    }

    @Test
    public void getSizeTest() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(new Integer(1));
        myArrayList.add(new Integer(2));
        myArrayList.add(new Integer(3));
        assertEquals(3,myArrayList.getSize());
    }

    @Test
    public void removeTest() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(new Integer(1));
        myArrayList.remove(1);
        assertEquals(true,myArrayList.isEmpty());
    }

    @Test
    public void getTest() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(new Integer(1));
        assertEquals(1,myArrayList.get(0));
    }

    @Test
    public void trimToSizeTest() {
        MyArrayList myArrayList = new MyArrayList(3);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.trimToSize();
        assertEquals(2,myArrayList.getData().length);
    }

    public void myIteratorTest() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        Iterator iterator = myArrayList.iterator();
        assertEquals(2,iterator.next());
        assertEquals(false,iterator.hasNext());
        iterator.remove();
        myArrayList.trimToSize();
        assertEquals(1,myArrayList.getSize());
    }
}
