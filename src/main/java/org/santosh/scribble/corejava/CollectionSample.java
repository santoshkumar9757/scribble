package org.santosh.scribble.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionSample {
    private String fname;
    private String lname;
    private int number;

    public CollectionSample(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public CollectionSample(int number) {
        this.number = number;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

  /*  @Override
    public int hashCode() {
        return 13;
    }*/

    public static void main(String[] args) {
        CollectionSample c1 = new CollectionSample("firstName1", "lastName1");
        CollectionSample c2 = new CollectionSample("firstName2", "lastName2");
        Map<CollectionSample, String> map = new HashMap<>();

        map.put(c1, "This is the first object");
        map.put(c2, "This is the second object");
        map.put(new CollectionSample("firstName1", "lastName1"), "Overriding First Person Object");
        System.out.println(map.size());
        System.out.println(map.get(c1));
        map.remove(c1);
        System.out.println("After removing element "+map.size());

        Set<CollectionSample> set = new HashSet<>();
        set.add(c1);
        set.add(c2);
        set.add(new CollectionSample("firstName1", "lastName1"));

        System.out.println(set.size());
        System.out.println(set.contains(c1));

        Map<String, String> mh = new HashMap<>();
        mh.put("Santosh", "1st Object");
        mh.put(new String("Santosh"), "2nd Object");

        System.out.println("String HashMap size:"+ mh.size());

        CollectionSample cs1 = new CollectionSample(1234);
        CollectionSample cs2 = new CollectionSample(1234);

        List<CollectionSample> list = new ArrayList<>();
        list.add(cs1);
        list.add(cs2);
        System.out.println("ArrayList->"+ list.size());

        Set<CollectionSample> set1 = new HashSet<>();
        set1.add(cs1);
        set1.add(cs2);
        System.out.println("HashSet->" + set1.size());

        Set<CollectionSample> set2 = new HashSet<>();
        set2.add(cs1);
        set2.add(cs1);
        System.out.println("HashSet->" + set2.size());

        Map<CollectionSample, String> map1 = new HashMap<>();
        map1.put(cs1, "1st Object");
        map1.put(cs2, "1st Object");
        System.out.println("HashMap size ->"+ map1.size());

    }

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionSample that = (CollectionSample) o;
        return fname.equals(that.fname) &&
                lname.equals(that.lname) &&
                number == that.number;
    }*/
}
