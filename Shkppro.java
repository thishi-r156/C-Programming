package com.company;
import java.util.Scanner;
public class ShopKeeperProduct  {

    protected String item_name, product_category;
    private int item_quantity;
    protected float price;
    protected Date manufacturing_date;
    protected int best_before;
    private String barcode;
    private float purchase_amount, margin_amount;
    protected float price_kg;
    protected Date expiryDate = new Date();
    protected String item_description;
    protected float offer;

    public float getPrice() {
        return getPrice_kg()+getMargin_amount();
    }

    public float getOffer() {
        return offer;
    }

    public void setOffer(float offer) {
        this.offer = offer;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public int getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }

    public String getManufacturing_date() {
        return manufacturing_date.day+"/"+ manufacturing_date.month+"/"+manufacturing_date.year;
    }

    public void setManufacturing_date(Date manufacturing_date) {
        this.manufacturing_date = manufacturing_date;
    }

    public int getBest_before() {
        return best_before;
    }

    public void setBest_before(int best_before) {
        this.best_before = best_before;
    }

    public float getPrice_kg() {
        return price_kg;
    }

    public void setPrice_kg() {
        this.price_kg = getPurchase_amount()/getItem_quantity();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public float getPurchase_amount() {
        return purchase_amount;
    }

    public void setPurchase_amount(float purchase_amount) {
        this.purchase_amount = purchase_amount;
    }

    public float getMargin_amount() {
        return margin_amount;
    }

    public void fixPrice() {
        this.price = getPrice_kg()+getMargin_amount();
    }
    public void fixPrice(float f){
        this.price = getPrice_kg()+getMargin_amount()-f;
    }

    Scanner sc = new Scanner(System.in);

    public void setMargin_amount(float margin_amount) {
        this.margin_amount = margin_amount;
    }

    public String getExpiryDate() {
        return expiryDate.day+"/"+expiryDate.month+"/"+expiryDate.year;
    }

    public void fixExpiryDate(){
        this.expiryDate.day = manufacturing_date.day+ best_before;
        this.expiryDate.month = manufacturing_date.month;
        this.expiryDate.year = manufacturing_date.year;
    }
}
