package com.company;

import java.awt.*;
import java.net.URI;
import java.util.Scanner;

public class Payment {

    private String payment_mode;

    public String getpayment_mode()
    {
        return payment_mode;
    }
    Scanner sc = new Scanner(System.in);
    public  void setPaymentMode(){
        int u,n,k;
        String card_no,exp_date,ch_name,ch,upi,mob_no;
        System.out.println("Enter the Payment Mode:\n1.Cash\n2.Debit/Credit Card\n3.UPI\n4.Wallets\n5.Net Banking\n6.QR Code");
        u = sc.nextInt();
        if(u == 1){
            this.payment_mode = "Cash";

        }else if(u == 2){
            this.payment_mode = "Debit/Credit Card";
            System.out.println("Card Number:");
            card_no = sc.nextLine();
            sc.nextLine();
            System.out.println("Expiration Date:");
            exp_date = sc.next();
            System.out.println("CVC/CVV Number:");
            k = sc.nextInt();
            System.out.println("Card Holder Name:");
            ch_name = sc.next();
            System.out.println("Press 'y' to make payment:");
            ch = sc.next();
            if(ch.equals('y')){
                System.out.println("Payment Successfull!!");
            }
        }else if(u == 3){
            this.payment_mode = "UPI";
            System.out.println("Enter UPI id");
            upi = sc.next();
            System.out.println("1.@ybl\n2.@hdfc\n3.@icici");
            n = sc.nextInt();
            if (n == 1) {
                upi = upi+"@ybl";
            }else if(n == 2){
                upi = upi+"@hdfc";
            }else if(n == 3){
                upi = upi+"@icici";
            }else{
                //do nothing
            }
            System.out.println("Payment Successfull!!");
        }else if(u == 4){
            this.payment_mode = "Wallets";
            System.out.println("1.Mobikwik\n2.Phone Pe\n3.Payzapp\n3.Amazon Pay\n4.Paytm\n5.G Pay\n6.Ola Money\n7.Jio Money");
            n = sc.nextInt();
            if(n == 1 || n == 2||n == 3||n==4 || n==5||n==6||n==7){
                System.out.println("Enter your mobile number:");
                mob_no = sc.next();
                System.out.println("Cash Debited\nPayment Successfull!!");
            }
        }else if(u == 5){
            this.payment_mode = "Net Banking";
            System.out.println("1.HDFC\n2.ICICI\n3.Axis\n4.SBI\n5.IOB");
            n = sc.nextInt();
            if(n == 1){
                try {
                    Desktop desktop = Desktop.getDesktop();
                    desktop.browse(new URI("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm"));
                }catch (Exception e){
                    e.getLocalizedMessage();
                }
            }else if(n == 2){
                try {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI("https://www.icicibank.com/Personal-Banking/insta-banking/internet-banking/index.page"));
                }catch (Exception e){
                    e.getLocalizedMessage();
                }
            }else if(n==3){
                try {
                    Desktop desktop = Desktop.getDesktop();
                    desktop.browse(new URI("https://www.axisbank.com/bank-smart/internet-banking/getting-started"));
                }catch (Exception e){
                    e.getLocalizedMessage();
                }
            }else if(n == 4){
                try {
                    Desktop desktop = Desktop.getDesktop();
                    desktop.browse(new URI("https://retail.onlinesbi.com/retail/login.htm"));
                }catch (Exception e){
                    e.getLocalizedMessage();
                }
            }else if(n == 5){
                try {
                    Desktop desktop = Desktop.getDesktop();
                    desktop.browse(new URI("https://www.iobnet.co.in/ibanking/login.do\""));
                }catch (Exception e){
                    e.getLocalizedMessage();
                }

            }else{
                //do nothing
            }
        }else if(u == 6){
            this.payment_mode = "QR Code";
        }else{
            //do ntg
        }
    }

}
