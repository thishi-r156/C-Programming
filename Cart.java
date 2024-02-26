package com.company;

import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cart {
    private int cart_no;
    private float sub_total ;
    private static int count = 0;

    public Cart()
    {
        count++;
    }

    public int getCart_no() {
        return cart_no;
    }

    public  void setSub_total() {
//        this.sub_total = calculateSubtotal();
    }
    public void setCart_no() {
        this.cart_no = Cart.count;
    }

    Scanner sc = new Scanner(System.in);
    int n,cho;
    public void setCartNo(){
        this.cart_no = count;
    }

    public HashMap<Integer, Product> addtoCart(Product[] a, int[] b){
        HashMap<Integer,Product> cart = new HashMap<>();
        int y;
        for(int i=0;i<b.length;i++){
            y = b[i];
            cart.put(i,a[y]);
            if(b[i] == 0){
                break;
            }
        }
        System.out.println("Item added to the stock successfully");
        System.out.println("Enter 1 to display cart:");
        cho = sc.nextInt();
        if(cho == 1) {
            displayCart(cart);
        }
        System.out.println("Enter 2 to delete items in the cart:");
        cho = sc.nextInt();
        if(cho == 2) {
            deleteProduct(cart);
            System.out.println("Items deleted");
        }
        System.out.println("\n------------------------");
        System.out.print("Total:Rs."+this.calculateSubtotal(cart));
        System.out.println("\n------------------------");
        return cart;
    }

    public void deleteProduct(HashMap<Integer,Product> y){
        System.out.println("Enter the product number you want to delete:");
        int i=0;

        while(true){
            n = sc.nextInt();
            if(n == 0){
                break;
            }
            y.remove(n);
            i++;
        }

    }
    public void displayCart(HashMap<Integer,Product> y){
        for(int i=0;i<y.size();i++){
            System.out.println(y.get(i).getItem_name()+"\n"+y.get(i).getPrice());
            System.out.println("");
            if(y.get(i) == y.get(i+1)){
                break;
            }
        }
    }

    public float calculateSubtotal(HashMap<Integer,Product> y) {
        float sum = 0;
        for (int i = 0; i < y.size(); i++) {
            sum = sum + y.get(i).getPrice();
        }
        return sum;
    }
}
