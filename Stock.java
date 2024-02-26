// package com.company;

public class Stock {
    private String product_categories, best_selling, clearance_stock;
    private int quantity;
    private float s_price;

    public String getProduct_categories() {
        return product_categories;
    }

    public void setProduct_categories(String product_categories) {
        this.product_categories = product_categories;
    }

    public String getBest_selling() {
        return best_selling;
    }

    public void setBest_selling(String best_selling) {
        this.best_selling = best_selling;
    }

    public String getClearance_stock() {
        return clearance_stock;
    }

    public void setClearance_stock(String clearance_stock) {
        this.clearance_stock = clearance_stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getS_price() {
        return s_price;
    }

    public void setS_price(float s_price) {
        this.s_price = s_price;
    }

    public void viewStock(ShopKeeperProduct[] list){
        for(int i=0;i < list.length;i++){
            System.out.print("Name:"+list[i].getItem_name());
            System.out.print("\nCategory:"+list[i].getProduct_category());
            System.out.print("\nQuantity:"+list[i].getItem_quantity());
            System.out.print("\nPurchase Amount:"+list[i].getPurchase_amount());
            System.out.print("\nMargin Amount:"+list[i].getMargin_amount());
            System.out.print("\nPrice:"+list[i].getPrice());
            System.out.print("\nMfg:"+list[i].getManufacturing_date());
            System.out.print("\nBest Before:"+list[i].getBest_before());
            System.out.print("\nExp:"+list[i].getExpiryDate());
            System.out.print("\nItem description:"+list[i].getItem_description());
            System.out.println("\n\n");
        }
    }
}
