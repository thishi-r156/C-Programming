package com.company;

import java.util.Scanner;
import java.util.UUID;

public class Manager extends  Employee{
    @Override
    public String getEmployee_name() {
        return super.employee_name;
    }

    @Override
    public void setEmployee_name(String employee_name) {
        super.employee_name = employee_name;
    }

    @Override
    public String getEmployee_id() {
        return super.employee_id;
    }

    @Override
    public void setEmployee_id(String employee_id) {
        super.employee_id = employee_id;
    }

    @Override
    public String getEmployee_phone() {
        return super.employee_phone;
    }

    @Override
    public void setEmployee_phone(String employee_phone) {
        super.employee_phone = employee_phone;
    }

    @Override
    public float getEmployee_salary() {
        return super.employee_salary;
    }

    @Override
    public void setEmployee_salary(float employee_salary) {
        super.employee_salary  = employee_salary;
    }

    Scanner sc = new Scanner(System.in);
    public void creditSalary(){
        String dep,id;
        double sal;
        System.out.println("Enter the department:");
        dep = sc.next();
        System.out.println("Enter the employee id:");
        id = sc.next();
        System.out.println("Enter the Salary amount:");
        sal = sc.nextDouble();

        if(sal > 0 ){
            System.out.println("Salary[Rs."+sal+"] Credited successfully");
        }else if(sal == 0){
            System.out.println("Salary[Rs."+sal+"] not credited");
        }else{
            System.out.println("Salary[Rs."+sal+"] debited successfully");
        }
    }

    public void addEmployee(){
        String dep,id;
        System.out.println("Enter the Employee department:");
        dep = sc.next();
        System.out.println("Enter the employee id:");
        id = sc.next();
        System.out.println("Employee added to the "+dep+" department");

    }

    public void removeEmployee(){
        String dep,id;
        System.out.println("Enter the Employee department:");
        dep = sc.next();
        System.out.println("Enter the employee id:");
        id = sc.next();
        System.out.println("Employee removed from the "+dep+" department");

    }

    public void transferEmployee(){
        String dep1,dep2,id;
        System.out.println("Enter the employee id:");
        id = sc.next();
        System.out.println("Enter the Employee's current department:");
        dep1 = sc.next();
        System.out.println("Enter the department to which the Employee should be transferred:");
        dep2 = sc.next();
        System.out.println("Employee transered from the "+dep1+" department to "+dep2+" department");
    }

    public void createManager(){
        String nme,eph;
        float esal;
        System.out.println("Enter Manager details:");

        System.out.println("Manager Name:");
        nme = sc.next();
        setEmployee_name(nme);

        UUID uniqueKey = UUID.randomUUID();
        String id = uniqueKey.toString();
        id = id.substring(0, 6);
        setEmployee_id(id);

        System.out.println("Phone No:");
        eph = sc.next();
        setEmployee_phone(eph);

        System.out.println("Salary:");
        esal = sc.nextFloat();
        setEmployee_salary(esal);

        System.out.println("Manager 1\n----------");
        System.out.println("Name:" + getEmployee_name() + "\nE_Id:" +getEmployee_id() + "\nPhone No:" +getEmployee_phone() + "\nSalary:" + getEmployee_salary());
    }

    @Override
    public void createStaff() {
        //dontg
    }

}
