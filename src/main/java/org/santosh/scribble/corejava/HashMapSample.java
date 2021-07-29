package org.santosh.scribble.corejava;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    public static void main(String[] args) {
        Map<WorDay, String> map = new HashMap<>();
        map.put(new WorDay("mon"), "play");
        map.put(new WorDay("mon"), "travel");
        map.put(new WorDay("tuesday"), "fool");
        System.out.println(map.size());

        /*CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("John");
        list.add("Mac");
        list.add("Kevin");

        Iterator<String> it = list.iterator();
        it.remove();

        while (it.hasNext()) {
            System.out.println(it.next());
        }*/
    }
}

class WorDay {
     String day;

     WorDay(String day) {
         this.day = day;
     }

     @Override
     public boolean equals (Object o) {
         return ((WorDay) o).day == this.day;
     }

     // calculate ASCII value of string
     @Override
    public int hashCode() {
        int result = 0;
        for (int i = 0; i < this.day.length(); i ++) {
            result = result + this.day.charAt(i);
        }
         return result;
     }
 }

