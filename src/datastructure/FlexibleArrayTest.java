package datastructure;

import com.sun.tools.javac.Main;

public class FlexibleArrayTest {
    public static void main(String[] args) {
        FlexibleArray<Integer> flexibleArray=
                new FlexibleArray<>();
        System.out.println("the current size =" + flexibleArray.size());
        flexibleArray.add(3);
        flexibleArray.remove(4);
    }
}
