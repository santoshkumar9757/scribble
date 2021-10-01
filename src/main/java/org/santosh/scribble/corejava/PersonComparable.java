package org.santosh.scribble.corejava;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class PersonComparable implements Comparable<PersonComparable>{
    String name;
    public PersonComparable(String name) {
        this.name = name;
    }

/*    @Override
    public int compareTo(Object o) {
        return 0;
    }*/

    @Override
    public int compareTo(PersonComparable o) {
        return 0;
    }
}

class Demo {
    public static void main(String[] args) {
        PersonComparable p1 = new PersonComparable("ABC");
        PersonComparable p2 = new PersonComparable("BCD");
        PersonComparable p3 = new PersonComparable("DEF");
        PersonComparable p4 = new PersonComparable("ABC");

        //Set<PersonComparable> set = new TreeSet();
        Set<PersonComparable> set = new HashSet();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        //set.add(p4);
        System.out.println(set.size());
        System.out.println(set);
    }
}