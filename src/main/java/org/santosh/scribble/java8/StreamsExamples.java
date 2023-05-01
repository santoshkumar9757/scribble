package org.santosh.scribble.java8;

import org.santosh.scribble.test.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsExamples {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee employee1 = new Employee(1, 100);
        Employee employee2 = new Employee(2, 200);
        Employee employee3 = new Employee(3, 300);
        Employee employee4 = new Employee(4, 400);
        Employee employee5= new Employee(5, 100);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);

        Map<Integer, Integer> empMap = list.stream().
                filter(employee -> employee.getSalary() > 300).
                collect(Collectors.toMap(Employee::getId, Employee::getSalary));

        System.out.println("====> employee Map" + empMap);

        // reduce() allows us to produce one single result from a sequence of elements
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);
        //int result = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum is ->" + result);
        System.out.println("===");

        List<Integer> duplicateAndNullElements = Arrays.asList(1, 2, 2, 4, 4, null, 5, 6);
        Set<Integer> uniqueSet = duplicateAndNullElements.stream().filter(Objects::nonNull).collect(Collectors.toSet());
        System.out.println("UniqueSet ==>" + uniqueSet);

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(letters.stream().reduce("", (partialString, element) -> partialString + element));
        System.out.println("===");

        System.out.println(list.stream().reduce(0, (partialSalary, employee) -> partialSalary + employee.getSalary(), Integer :: sum));
        System.out.println("===");

        List<Integer> intList = Arrays.asList(2, 5, 3, 4);
        intList.stream().map(integer -> integer*2).collect(Collectors.toList()).forEach(System.out :: print);
        System.out.println();
        System.out.println("===");
        long count = intList.stream().filter(integer -> integer > 0).count();

        intList.stream().filter(integer -> integer % 2 !=0).map(inte -> inte*inte).reduce(0, (partialSum, inte) -> partialSum + inte);
        System.out.println();
        System.out.println("Square===");
                //reduce(0, (partialSum, inte) -> partialSum + inte);

        /* Ascending order */
        intList.stream().sorted().collect(Collectors.toList()).forEach(System.out :: print);
        System.out.println();
        System.out.println("===");

        /* Descending order */
        intList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out :: print);
        System.out.println();
        System.out.println("===");

        /*https://www.baeldung.com/java-sorting-arrays*/
        list.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).collect(Collectors.toList()).forEach(System.out :: print);

        System.out.println();
        System.out.println("===");



        String san = "santosh";
        System.out.println(san.chars().filter(value -> value == 's').count());

        char[] arr = san.toCharArray();
        Arrays.sort(arr);
        //san.chars().sorted().mapToObj(value -> (char) value).forEach(System.out::println);
        System.out.println(String.valueOf(arr));

        Character[] desArr = san.chars().mapToObj(value -> (char) value).toArray(Character[] :: new);
        Arrays.sort(desArr, Comparator.reverseOrder());
        Arrays.stream(desArr).map(Objects :: toString).forEach(System.out :: print);

        System.out.println();
        System.out.println("===");

        List<Integer> uniqueList = Arrays.asList(4, 4, 3, 4);

        System.out.println("Unique Element: " +uniqueList.stream().filter(integer -> Collections.frequency(uniqueList, integer) == 1).findFirst().get());

        Optional<String> fullName = Optional.of("Tom");
        fullName = Optional.ofNullable(null);
        String ss = fullName.orElseGet(() -> "[none]");
        System.out.println(ss);
        System.out.println(fullName.map(s -> "Hey"+ s).orElse("Hey Tommy"));


    }
}
