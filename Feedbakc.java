package com.company;

import java.util.Scanner;

public class FeedBack {
    private String customer_review;
    private int rating;
    Scanner sc = new Scanner(System.in);

    public String getCustomer_review() {
        return customer_review;
    }
    public int getRating() {
        return rating;
    }

    public void setRating(){
        System.out.println("Enter the rating:");
        this.rating = sc.nextInt();
    }
    public void setCustomerReview(){
        System.out.println("Enter the customer review:");
        this.customer_review=sc.next();
    }
}
