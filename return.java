package com.company;

import java.util.Scanner;

public class Return {
    Scanner sc = new Scanner(System.in);
    String bar;
    public void addProductStock(){
        System.out.println("Enter item's barcode");
        bar = sc.next();
        System.out.println("Item added to stock successfully");
    }

//    public float debitItemPrice(){
//
//    }
}
