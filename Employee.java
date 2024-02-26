package com.company;

public abstract class Employee {
    public String employee_name, employee_id, employee_phone;
    public float employee_salary;

    abstract public String getEmployee_name();

    abstract public void setEmployee_name(String employee_name);

    abstract public String getEmployee_id() ;

    abstract public void setEmployee_id(String employee_id);

    abstract public String getEmployee_phone() ;

    abstract public void setEmployee_phone(String employee_phone) ;

    abstract public float getEmployee_salary();

    abstract public void setEmployee_salary(float employee_salary);

    abstract public void createManager();

    abstract  public  void createStaff();

    abstract public void creditSalary();

    abstract public void addEmployee();

    abstract public void removeEmployee();

    abstract public void transferEmployee();

}
