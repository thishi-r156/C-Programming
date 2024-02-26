// package com.company;
import java.util.Scanner;
import java.util.UUID;

public class Delivery {
    private String order_id;
    private Date delivery_date = new Date();



    public String getOrder_id() {
        return order_id;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    Scanner sc = new Scanner(System.in);

    void setOrderId(){
        UUID uniqueKey = UUID.randomUUID();
        String hi = uniqueKey.toString();
        this.order_id = hi.substring(0,6);
    }

    void setDeliverDate() {
        String d;
        System.out.println("Enter Delivery Date:");
        d = sc.next();
        delivery_date.year = Integer.parseInt(d.substring(6));
        delivery_date.month = Integer.parseInt(d.substring(3,5));
        delivery_date.year = Integer.parseInt(d.substring(0,2));
    }
}
