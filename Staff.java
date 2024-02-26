package com.company;

import java.util.Scanner;
import java.util.UUID;

public class Staff extends  Employee{
    public String department;
    public int working_hours, staff_attendance;



    Scanner sc = new  Scanner(System.in);

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }

    public int getStaff_attendance() {
        return staff_attendance;
    }

    public void setStaff_attendance(int staff_attendance) {
        this.staff_attendance = staff_attendance;
    }

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

    @Override
    public void createManager() {
        //do ntg
    }
    @Override
    public void creditSalary() {
        //do ntg
    }

    @Override
    public void addEmployee() {
        //do ntg
    }

    @Override
    public void removeEmployee() {
        //do ntg
    }

    @Override
    public void transferEmployee() {
        //do ntg
    }

    @Override
    public void createStaff() {
        String dept,jk,ide,ep;
        int wrk,att;
        float es;
        System.out.println("Enter staff details:");
        System.out.println("Staff Name:");
        jk = sc.next();
        setEmployee_name(jk);

        UUID uniqueKey = UUID.randomUUID();
        String id = uniqueKey.toString();
        id = id.substring(0, 6);
        setEmployee_id(id);

        System.out.println("Phone No:");
        ep = sc.next();
        setEmployee_phone(ep);

        System.out.println("Staff Salary:");
        es = sc.nextFloat();
        setEmployee_salary(es);

        System.out.println("Department:");
        dept = sc.next();
        setDepartment(dept);

        System.out.println("Working Hours:");
        wrk = sc.nextInt();
        setWorking_hours(wrk);

        System.out.println("Attendance:");
        att = sc.nextInt();
        setStaff_attendance(att);



        System.out.println("Staff 1\n-------");
        System.out.println("Name"+getEmployee_name()+"\nId:"+getEmployee_id()+"\nDepartment:"+getDepartment()+"\nSalary:"+getEmployee_salary()+"\nPhone No:"+getEmployee_phone()+"\nWorking hrs:"+getWorking_hours()+"\nAttendance:"+getStaff_attendance());
    }

}
