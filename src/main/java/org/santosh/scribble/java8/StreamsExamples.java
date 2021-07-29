package org.santosh.scribble.java8;

import org.santosh.scribble.test.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class StreamsExamples {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee employee1 = new Employee(1, 100);
        Employee employee2 = new Employee(2, 200);
        Employee employee3 = new Employee(3, 300);
        Employee employee4 = new Employee(4, 400);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        // Collection of employees if employee id is 4 then update his salary in same list
        Optional<Employee> em = list.stream().filter(employee -> employee.getId() == 2).peek(employee -> employee.setSalary(500)).findFirst();
        System.out.println(em.map(Employee::getSalary));
        System.out.println(list.stream().reduce(0, (partialSalary, employee) -> partialSalary + employee.getSalary(), Integer::sum));

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ScheduledExecutorService executorService1 = Executors.newSingleThreadScheduledExecutor();


    }



}
