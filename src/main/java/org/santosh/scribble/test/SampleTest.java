package org.santosh.scribble.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.logging.log4j.Logger;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class SampleTest {
    public static void main(String[] args) {
        /*  List<Integer> numbers = Arrays.asList(4,2,5,8);
        //System.out.println("Hello");
        //NumberFormat.getInstance();
        //int i = 6, j = 4, k = 9;
        //SampleTest.doIt(i, j, k);
        //System.out.println(k);

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
        } */
 
        List<Integer> birdList = Arrays.asList(1, 2, 1, 2, 1, 3, 2);
        int pairs = 0;
       
        Collection<List<Integer>> groupList = birdList.stream().collect(Collectors.groupingBy(Integer::intValue)).values();
        for(List<Integer> list : groupList) {
            pairs = pairs + list.size()/2;
        } 
    
        log.debug("GroupBy: {}", pairs);
       
        Set<Integer> colors = new HashSet<>();
        int pairs1 = 0;

        for (int i = 0; i < birdList.size(); i++) {
            if (!colors.contains(birdList.get(i))) {
                colors.add(birdList.get(i));
            } else {
                pairs1++;
                colors.remove(birdList.get(i));
            }
        }
        log.debug("Pairs: {}", pairs1); 
        migratoryBirds(birdList);

        // Get first occuring unique character from a given string    
        String a = "acvabv";
        Set<Character> uniqueCharacters = new LinkedHashSet<>();

        for (int i = 0; i < a.length(); i++) {
            if (uniqueCharacters.add(a.charAt(i))) {
                uniqueCharacters.add(a.charAt(i));
            } else {
                uniqueCharacters.remove(a.charAt(i));
            }
        }
        log.debug("Unique Character: {}", uniqueCharacters.iterator().next());
    }

     private static void migratoryBirds(List<Integer> birdList) {
        birdList.stream();
        Map<Integer, Integer> birdMap = new HashMap<>();
        
        for (Integer birdType : birdList) {
            if (birdMap.containsKey(birdType)) {
                int count = birdMap.get(birdType);
                birdMap.put(birdType, count + 1);
            } else {
                birdMap.put(birdType, 1);
            }
        }
        log.debug("BirdMap: {}", birdMap);
        log.debug("Most Frequently sighted bird type: {}", Collections.max(birdMap.entrySet(), Map.Entry.comparingByValue()).getKey());
    } 
}
