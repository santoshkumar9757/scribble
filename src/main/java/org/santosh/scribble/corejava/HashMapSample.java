package org.santosh.scribble.corejava;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSample {
    public static void main(String[] args) {
        Map<WorDay, String> map = new HashMap<>();
        map.put(new WorDay("mon"), "play");
        map.put(new WorDay("mon"), "travel");
        map.put(new WorDay("tuesday"), "fool");
        System.out.println(map.size());

/*        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("John");
        list.add("Mac");
        list.add("Kevin");

        Iterator<String> it = list.iterator();
        it.remove();

        while (it.hasNext()) {
            System.out.println(it.next());
        }*/

    /*    Map<String, String> map = new HashMap<>();
        map.put("1", "Santosh");
        map.put("2", "Santosh");
        map.put("3", "Man");

        System.out.println(map.size());*/
        List<WorDay> wordDays = new ArrayList();
        wordDays.add(new WorDay("one", "Jan"));
        wordDays.add(new WorDay("abc", "Feb"));
        wordDays.add(new WorDay("san", "Jan"));
        wordDays.add(new WorDay("man", "Apr"));

        Map<String, List<String>> hm = wordDays.stream().collect(
                                                            Collectors.groupingBy(WorDay::getMonth,
                                                                    Collectors.mapping(WorDay::getDay, Collectors.toList())));
        System.out.println(hm);
        Map<String, List<WorDay>> hm1 = wordDays.stream().collect(
                Collectors.groupingBy(WorDay::getMonth));

        System.out.println(hm1);


    }

  /*  @Override
    public int hashCode() {
        return 1;
    }*/
}

@Setter
@Getter
@AllArgsConstructor
class WorDay {
     String day;
     String month;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorDay{");
        sb.append("day='").append(day).append('\'');
        sb.append(", month='").append(month).append('\'');
        sb.append('}');
        return sb.toString();
    }

    static class WordDaySorter implements Comparator<WorDay> {

        @Override
        public int compare(WorDay o1, WorDay o2) {
           return o1.getDay().compareTo(o2.getDay());
        }
    }
}

