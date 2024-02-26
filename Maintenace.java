package com.company;

import java.util.Scanner;

public class Maintenance extends CashBox{
    private float rent_amount, EB, employee_salary, transport_charges, water_expenses;
    private float advert_expenses, communication_expenses;
    private float insurance_premium, expired_stock, miscellaneous_expenses;
    private float total_maintenance;

    public Maintenance(float rent_amount, float EB, float employee_salary, float transport_charges, float water_expenses, float advert_expenses,
                       float communication_expenses, float insurance_premium, float expired_stock, float miscellaneous_expenses,float opening_balance, float closing_amount) {
       super(opening_balance,closing_amount);
       this.rent_amount = rent_amount;
       this.EB = EB;
       this.employee_salary = employee_salary;
       this.transport_charges = transport_charges;
       this.water_expenses = water_expenses;
       this.advert_expenses = advert_expenses;
       this.communication_expenses = communication_expenses;
       this.insurance_premium = insurance_premium;
       this.expired_stock = expired_stock;
       this.miscellaneous_expenses = miscellaneous_expenses;
    }

    public float getRent_amount() {
        return rent_amount;
    }

    public void setRent_amount(float rent_amount) {
        this.rent_amount = rent_amount;
    }

    public float getEB() {
        return EB;
    }

    public void setEB(float EB) {
        this.EB = EB;
    }

    public float getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(float employee_salary) {
        this.employee_salary = employee_salary;
    }

    public float getTransport_charges() {
        return transport_charges;
    }

    public void setTransport_charges(float transport_charges) {
        this.transport_charges = transport_charges;
    }

    public float getWater_expenses() {
        return water_expenses;
    }

    public void setWater_expenses(float water_expenses) {
        this.water_expenses = water_expenses;
    }

    public float getAdvert_expenses() {
        return advert_expenses;
    }

    public void setAdvert_expenses(float advert_expenses) {
        this.advert_expenses = advert_expenses;
    }

    public float getCommunication_expenses() {
        return communication_expenses;
    }

    public void setCommunication_expenses(float communication_expenses) {
        this.communication_expenses = communication_expenses;
    }

    public float getInsurance_premium() {
        return insurance_premium;
    }

    public void setInsurance_premium(float insurance_premium) {
        this.insurance_premium = insurance_premium;
    }

    public float getExpired_stock() {
        return expired_stock;
    }

    public void setExpired_stock(float expired_stock) {
        this.expired_stock = expired_stock;
    }

    public float getMiscellaneous_expenses() {
        return miscellaneous_expenses;
    }

    public void setMiscellaneous_expenses(float miscellaneous_expenses) {
        this.miscellaneous_expenses = miscellaneous_expenses;
    }

    Scanner sc = new Scanner(System.in);
    public float calculateMaintenance(){
        this.total_maintenance = getRent_amount()+getEB()+getEmployee_salary()+getTransport_charges()+getWater_expenses()+getAdvert_expenses()+getCommunication_expenses()+getInsurance_premium()+getExpired_stock()+getMiscellaneous_expenses();
        return  total_maintenance;
    }



}
