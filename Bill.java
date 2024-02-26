package com.company;

import java.util.ArrayList;

public class Bill implements ShopDetails{
    static int count = 0;
    public String order_id ;
    public ArrayList<String> bill_item_name;
    public ArrayList<Integer> bill_item_quanity;
    public ArrayList<Float> bill_item_price;
    public Date bill_date;
    public int bill_no;
    public float item_gst_amount, payable_amount ;

    public Bill() {
        count = count+1;
    }
//    public int getCount(){
//        return count;
//    }
    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public int getBill_no() {
        return bill_no;
    }

    public void setBill_no(int bill_no) {
        this.bill_no = bill_no;
    }

    public Date getBill_date() {
        return bill_date;
    }

    public void setBill_date(Date bill_date) {
        this.bill_date = bill_date;
    }

    public float getItem_gst_amount() {
        return item_gst_amount;
    }

    public void setItem_gst_amount(float item_gst_amount) {
        this.item_gst_amount = item_gst_amount;
    }

    public float getPayable_amount() {
        return payable_amount;
    }

    public void setPayable_amount(float payable_amount) {
        this.payable_amount = payable_amount;
    }

    public float calculatePayableAmount(){
        float sum = 0;
        for(int i=0;i<bill_item_price.size();i++){
            sum = sum+bill_item_price.get(i);
        }
        return sum;
    }

    public String toString(){
        return ShopDetails.shop_name+"\n"+ShopDetails.GST_number+"\n"+ShopDetails.shop_address;
    }
    public void printBill(){
        toString();
//        System.out.println("Order Id:"+getOrder_id());

        System.out.println("--------------------------------");
        for(int i = 0;i<bill_item_name.size();i++){
            if(bill_item_name.get(i) == null || bill_item_name.get(i).equals(0)) {
                break;
            }

            System.out.println(bill_item_name.get(i)+"\t\t"+bill_item_price.get(i)+"\n"+bill_item_quanity.get(i));
        }
        System.out.println("--------------------------------");
        System.out.println("Total Amount:Rs."+calculatePayableAmount());
        System.out.println("--------------------------------");
        System.out.println(ShopDetails.return_policy);
    }
}
