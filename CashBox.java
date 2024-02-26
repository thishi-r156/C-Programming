package com.company;

import java.util.Scanner;

public class CashBox {
    public float opening_balance, closing_amount,profit,loss;

    public CashBox(float opening_balance, float closing_amount)
    {
       this.opening_balance = opening_balance;
       this.closing_amount = closing_amount;
    }

    public float getOpening_balance() {
        return opening_balance;
    }

    public void setOpening_balance(float opening_balance) {
        this.opening_balance = opening_balance;
    }


    public float getClosing_amount() {
        return closing_amount;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public float getLoss() {
        return loss;
    }

    public void setLoss(float loss) {
        this.loss = loss;
    }

    public void setClosing_amount(float closing_amount) {
        this.closing_amount = closing_amount;
    }
    float dto;
    int d,m,y;
    Scanner sc = new Scanner(System.in);

    public float calculateDailyTurnOver(float a,float b){

                dto = a - b;
                return dto;
    }

    public float calculateMonthlyTurnOver(int m,float p){
            if(m == 1||m == 3||m == 5||m == 7||m == 9||m == 11) {
                return 31 *p;
            }else if(m == 4|| m == 6||m == 8||m == 10 ||m == 12){
                return 30 * p;
            }else{
                return  28*p;
            }
    }

    public float calculateYearlyTurnover(float u){
        return 12*u;
    }


    public void calculateProfitLoss(float a,float b,float c){
        float dto = calculateDailyTurnOver(b,c);
        float main = a;
        if( dto > main){
            this.profit  = main- dto;
        }else if(dto == main){
            this.profit = 0;
        }else{
            this.loss = main - dto;
        }
    }
}
