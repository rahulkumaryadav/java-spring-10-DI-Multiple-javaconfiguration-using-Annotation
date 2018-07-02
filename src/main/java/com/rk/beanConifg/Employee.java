package com.rk.beanConifg;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String empName;

    @Autowired
    private Student studentEmp;

    @Autowired
    private IdCard idCardEmp;

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", studentEmp=" + studentEmp +
                ", idCardEmp=" + idCardEmp +
                '}';
    }
}
