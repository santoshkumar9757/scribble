package org.santosh.scribble.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SampleTest {

  /*  static void doIt(int x, int y, int m) {
        if (x == 5) {
            m = y;
        } else
            m = x;
    }*/
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,2,5,8);
        //System.out.println("Hello");
        //NumberFormat.getInstance();
        /*int i = 6, j = 4, k = 9;
        SampleTest.doIt(i, j, k);
        System.out.println(k);*/

        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "value1");
        map.put(2, "value2");
        map.put(3, "value3");
        map.put(4, "value4");

        try {
            for (Map.Entry<Integer, String> itr : map.entrySet()) {
                map.remove(2);
                System.exit(0);
            }
        }
        finally {
            System.out.println(map.size());
            System.out.println("Finally");
        }

    }


}
