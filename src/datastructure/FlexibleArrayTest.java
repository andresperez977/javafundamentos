package datastructure;

import com.sun.tools.javac.Main;

public class FlexibleArrayTest {
    public static void main(String[] args) {
        FlexibleArray<Integer> flexibleArray=
                new FlexibleArray<>(3);
        System.out.println("the current size =" + flexibleArray.size());
        for (int i = 0; i < 5; i++) {
        	flexibleArray.add(3+i);
		}
       System.out.println("the current size =" + flexibleArray.size());
        flexibleArray.remove(1);
    }
}
