package com.company;
import java.util.Scanner;

public class Customer {
    private String customer_name, customer_id, customer_email, customer_phone,a,b,c;
    private Address customer_address =  new Address("","","") ;
    public FeedBack feed ;

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_address() {
        return customer_address.street+","+customer_address.city+","+customer_address.pincode;
    }


    public void setCustomer_address(String street, String city, String pincode) {
    customer_address.street  = street;
    customer_address.city = city;
    customer_address.pincode = pincode;
    }

    Scanner sc = new Scanner(System.in);

    public void login(){
        String name,email,phone;
        Address add = new Address("","","");
        System.out.print("Hello!\nLogin\n-------\nName:");
        name = sc.next();
        setCustomer_name(name);
        System.out.print("\nEmail:");
        email = sc.next();
        setCustomer_email(email);
        System.out.print("\nPhone:");
        phone = sc.next();
        setCustomer_phone(phone);
        System.out.print("\nAddress:");
        add.street = sc.next();
        add.city = sc.next();
        add.pincode = sc.next();
        setCustomer_address(add.street,add.city,add.pincode);
    }


    boolean deliveryAvailability(){
        String a = customer_address.street;
        String b = customer_address.city;
        String c = customer_address.pincode;
        Address ad1 = new Address("123,Main Street","Coimbatore","641101");
        Address ad2 = new Address("17th,Avenue","Coimbatore","641102");
        Address ad3 = new Address("Bloods Street","Coimbatore","641103");
        Address ad4 = new Address("Thomas Street","Coimbatore","641104");
        Address ad5 = new Address("Crosscut Road","Coimbatore","641105");
        Address ad6 = new Address("Townhall Road","Coimbatore","641106");
        Address ad7 = new Address("TVS","Coimbatore","641107");
        Address ad8 = new Address("Saibaba Colony","Coimbatore","641108");
        Address ad9 = new Address("MTP Road","Coimbatore","641109");
        Address ad10 = new Address("Bharathi Road","Coimbatore","641110");
        Address ad11 = new Address("University Road","Coimbatore","641111");

        if(     (a == ad1.getStreet() && b == ad1.getCity() &&  c == ad1.getPincode())||
                (a == ad2.getStreet() && b == ad2.getCity() &&  c == ad2.getPincode())||
                (a == ad3.getStreet() && b == ad3.getCity() &&  c == ad3.getPincode())||
                (a == ad4.getStreet() && b == ad4.getCity() &&  c == ad4.getPincode())||
                (a == ad5.getStreet() && b == ad5.getCity() &&  c == ad5.getPincode())||
                (a == ad6.getStreet() && b == ad6.getCity() &&  c== ad6.getPincode())||
                (a == ad7.getStreet() && b== ad7.getCity() &&  c == ad7.getPincode())||
                (a == ad8.getStreet() && b == ad8.getCity() &&  c== ad8.getPincode())||
                (a == ad9.getStreet() && b == ad9.getCity() &&  c == ad9.getPincode())||
                (a == ad10.getStreet() && b == ad10.getCity() &&  c == ad10.getPincode())||
                (a == ad11.getStreet() && b == ad11.getCity() &&  c == ad11.getPincode())){
            return true;
        }else{
            return false;
        }

    }

}
