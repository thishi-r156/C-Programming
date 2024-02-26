package com.company;

public class Product extends ShopKeeperProduct{
    private float price;
    public void fixPrice(float price){
        this.price =  price;
    }
    public float getPrice(){
        return price;
    }
    public String viewProduct(){
        return ("Name:"+super.getItem_name()+"\nCategory:"+super.getProduct_category()+"\nPrice:Rs."+this.getPrice()+"\nManufacture Date:"+super.getManufacturing_date()+"\nBest Before:"+super.getBest_before()+"\nExpire date:"+super.getExpiryDate()+"\nDescription:"+super.getItem_description());
    }
}
