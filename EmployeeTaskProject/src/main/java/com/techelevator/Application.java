package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        // holds all the employees
        List<Employee> employeeList = new ArrayList<>();

        Employee temp = new Employee();
        temp.setName("Bob Smith");
        temp.addToTaskList("Sweep Floor", 1);

        employeeList.add(temp);

        Employee temp1 = new Employee();
        temp1.setName("Sue Smith");
        temp1.addToTaskList("Sweep Floor", 5);
        temp1.addToTaskList("Wash Counters", 1);
        employeeList.add(temp1);


        for (Employee employee: employeeList){
            System.out.println("Employee Name: " +
                    employee.getName());

            for (Map.Entry<String, Integer> map: employee.getTaskList().entrySet()){
                System.out.println(map.getKey() + " rating: " + map.getValue());
            }
        }

        //loop to display highest rating for specific task
    }
}
