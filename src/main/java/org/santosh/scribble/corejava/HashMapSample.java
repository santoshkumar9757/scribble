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
        Map<WorkDay, String> map = new HashMap<>();
        map.put(new WorkDay("mon"), "play");
        map.put(new WorkDay("mon"), "travel");
        map.put(new WorkDay("tuesday"), "fool");
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
        List<WorkDay> wordDays = new ArrayList();
        wordDays.add(new WorkDay("one", "Jan"));
        wordDays.add(new WorkDay("abc", "Feb"));
        wordDays.add(new WorkDay("san", "Jan"));
        wordDays.add(new WorkDay("man", "Apr"));

        Map<String, List<String>> hm = wordDays.stream().collect(
                                                            Collectors.groupingBy(WorkDay::getMonth,
                                                                    Collectors.mapping(WorkDay::getDay, Collectors.toList())));
        System.out.println(hm);
        Map<String, List<WorkDay>> hm1 = wordDays.stream().collect(
                Collectors.groupingBy(WorkDay::getMonth));

        System.out.println(hm1);

       for (WorkDay day : wordDays) {
           hm1.computeIfAbsent("xyz", k -> new ArrayList<>()).add(day);
       }

    }

  /*  @Override
    public int hashCode() {
        return 1;
    }*/
}

@Setter
@Getter
@AllArgsConstructor
class WorkDay {
     String day;
     String month;

     WorkDay(String day) {
         this.day = day;
     }


     @Override
     public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof WorkDay) {
            WorkDay workDay = (WorkDay) o ;
            return workDay.day.equals(this.day);
        }
         return false;
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

    static class WordDaySorter implements Comparator<WorkDay> {

        @Override
        public int compare(WorkDay o1, WorkDay o2) {
           return o1.getDay().compareTo(o2.getDay());
        }
    }
}

