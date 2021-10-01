package org.santosh.scribble.testpkg.p2;

import org.santosh.scribble.testpkg.p1.Parent;

import java.util.HashMap;
import java.util.Map;

public class ChildUtil extends Parent {
    public static void main(String[] args) {
        new ChildUtil().callStuff();
    }

    void callStuff() {
        System.out.println("this "+ this.doStuff());
        Parent parent = new Parent();
        System.out.println("Parent " + parent.x);

        String s1 = "abc";
        String s2 = s1;
        s1 += "d";
        System.out.println(s1 + " "+ s2 + " " + (s1 ==s2));

        Map<String, Integer> map = new HashMap<>();
        String a = "abc";
        String b = new String("abc");
        map.put(a, 20);
        map.put(b, 20);
        map.put(new String("abc"), 30);
        System.out.println(map.get("abc"));

        long a1 [] = {3,4,5};
        long a2 [] = a1;
        a2[1] = 7;
        System.out.print(a1[0] + a1[1] + a1[2] + " ");
        System.out.println(a2[0] + a2[1] + a2[2] + " ");

    }



}
