package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Cashier extends Employee {

    Scanner sc = new Scanner(System.in);
    public void generateBill(Product[] a,int[] b) {
        String k;
        int p;
        float r,pay;
        int q,bno;
        Date d = new Date();
        Bill bill1 = new Bill();
        bill1.bill_item_name = new ArrayList<String>();
        bill1.bill_item_quanity = new ArrayList<Integer>();
        bill1.bill_item_price = new ArrayList<Float>();
        String id = sc.next();
        bill1.setOrder_id(id);
        System.out.println("Enter item name,price,quantity:");
        for(int i=0;i<b.length;i++){
            a[i] = new Product();
            p = b[i];
            bill1.bill_item_name.add(a[p].getItem_name());
            bill1.bill_item_quanity.add(a[p].getItem_quantity());
            bill1.bill_item_price.add(a[p].getPrice());
        }

        System.out.println("Enter bill date:");
        k = sc.next();
        d.day = Integer.parseInt(k.substring(0,2));
        d.month = Integer.parseInt(k.substring(3,5));
        d.year = Integer.parseInt(k.substring(6));
        bill1.bill_date = d;
        pay = bill1.calculatePayableAmount();
        System.out.println("Bill No:"+Bill.count);
        bill1.printBill();
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

    }

    @Override
    public void createStaff() {

    }

    @Override
    public void creditSalary() {

    }

    @Override
    public void addEmployee() {

    }

    @Override
    public void removeEmployee() {

    }

    @Override
    public void transferEmployee() {

    }

}
