package com.zxy.learning.arithmetic.simple;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName GetImportance.java
 * @Description 690
 * @createTime 2019年08月05日 13:38:00
 */
public class GetImportance {

    public int getImportance(List<Employee> list ,int id){
        Employee employee = null;
        int sum = 0;
        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        list.forEach(temp->{
            employeeMap.put(temp.getId(), temp);
        });
        ArrayDeque<Employee> employeeArrayDeque = new ArrayDeque<>();
        employeeArrayDeque.add(employeeMap.get(id));
        while (!employeeArrayDeque.isEmpty()){
            Employee tempEmployee = employeeArrayDeque.removeFirst();
            sum += tempEmployee.getImportance();
            employee.getSubEmployee().forEach( tempEmp ->{
                employeeArrayDeque.add(tempEmp);
            });
        }
        return sum;
    }

    static class Employee{
        private int id;
        private int importance;
        private List<Employee>  subEmployee;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getImportance() {
            return importance;
        }

        public void setImportance(int importance) {
            this.importance = importance;
        }

        public List<Employee> getSubEmployee() {
            return subEmployee;
        }

        public void setSubEmployee(List<Employee> subEmployee) {
            this.subEmployee = subEmployee;
        }
    }
}
