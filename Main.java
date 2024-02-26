package com.company;
import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        int a,b,qua,bb,numpro,cho,da,h,v,yen;
        float pa,ma,off;
        Date mdf = new Date();
        String name,desc,manu;
        boolean ea;
        HashMap<Integer,Product>  ce = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME!!\n---------\n1.Customer\n2.ShopKeeper");
        a = sc.nextInt();
        System.out.println("Enter the number of products:");
        numpro = sc.nextInt();
        ShopKeeperProduct[] shkp = new ShopKeeperProduct[numpro];
        System.out.println("ENTER ITEM DETAILS TO STORE IN THE STOCK\n-----------------------------------------");
        for(int i = 0;i<numpro;i++) {

            System.out.println("Enter item name:");
            name = sc.next();

            shkp[i] = new ShopKeeperProduct();
            shkp[i].setItem_name(name);

            System.out.println("Enter Product Category:\n1.Fruits and Vegetables\n2.Diary Product\n3.Bakery\n4.Staples\n5.Snacks\n6.Stationery\n7.Personal Care\n8.Home care");
            b = sc.nextInt();

            if (b == 1) {
                shkp[i].setProduct_category("Fruits and Vegetables");
            } else if (b == 2) {
                shkp[i].setProduct_category("Diary Product");
            } else if (b == 3) {
                shkp[i].setProduct_category("Bakery");
            } else if (b == 4) {
                shkp[i].setProduct_category("Staples");
            } else if (b == 5) {
                shkp[i].setProduct_category("Snacks");
            } else if (b == 6) {
                shkp[i].setProduct_category("Stationery");
            } else if (b == 7) {
                shkp[i].setProduct_category("Personal Care");
            } else if (b == 8) {
                shkp[i].setProduct_category("Home care");
            } else {
                ///do nothing
            }

            System.out.println("Enter the item quantity:");
            qua = sc.nextInt();
            shkp[i].setItem_quantity(qua);

            System.out.println("Enter Purchase Amount:");
            pa = sc.nextFloat();
            shkp[i].setPurchase_amount(pa);

            System.out.println("Enter Margin Amount:");
            ma = sc.nextFloat();
            shkp[i].setMargin_amount(ma);
            shkp[i].setPrice_kg();

            System.out.println("Enter Manufacturing date:");
            manu = sc.next();
            mdf.setDay(Integer.parseInt(manu.substring(0,2)));
            mdf.setMonth(Integer.parseInt(manu.substring(3,5)));
            mdf.setYear(Integer.parseInt(manu.substring(6)));
            shkp[i].setManufacturing_date(mdf);
            System.out.println("Enter best before:");
            bb = sc.nextInt();
            sc.nextLine();
            shkp[i].setBest_before(bb);
            shkp[i].fixExpiryDate();
            System.out.println("Enter Item Description:");
            desc = sc.nextLine();
            shkp[i].setItem_description(desc);
        }

        Stock st = new Stock();
        st.viewStock(shkp);
        System.out.println("Press '1' for Maintenance expenses:");
        yen = sc.nextInt();
        if(yen == 1){
            float rnam,empsal,eb,trans,wat,adv,comm,ins,exp,mis,pro,loss,open,close;
            System.out.println("Opening Balance:");
            open = sc.nextFloat();
            System.out.println("Rent Amount:");
            rnam = sc.nextFloat();
            System.out.println("Electricity Bill:");
            eb = sc.nextFloat();
            System.out.println("Employee Salary:");
            empsal = sc.nextFloat();
            System.out.println("Transport Charges:");
            trans = sc.nextFloat();
            System.out.println("Water expenses:");
            wat = sc.nextFloat();
            System.out.println("Advertisement Expenses:");
            adv = sc.nextFloat();
            System.out.println("Communication Expenses:");
            comm = sc.nextFloat();
            System.out.println("Insurance Premium:");
            ins = sc.nextFloat();
            System.out.println("Expired Stock loss:");
            exp = sc.nextFloat();
            System.out.println("Miscelleneous Expenses:");
            mis = sc.nextFloat();
            System.out.println("Closing Balance");
            close = sc.nextFloat();
//            System.out.println("");

            float yb;
            Maintenance main = new Maintenance(rnam,eb,empsal,trans,wat,adv,comm,ins,exp,mis,open,close);
            yb = main.calculateMaintenance();
            System.out.println("------------------\nTotal Maintenance expenses:"+yb+"\n------------------");

            System.out.println("Press 2 to calculate Profit/loss");
            yen = sc.nextInt();
            if(yen == 2){
                float x,y,z;
                CashBox cashBox = new CashBox(open,close);
                System.out.println("Enter the opening and closing balance:");
                float opening_balance = sc.nextFloat();
                float closing_amount  = sc.nextFloat();
                x =cashBox.calculateDailyTurnOver(opening_balance,closing_amount);
                y =cashBox.calculateMonthlyTurnOver(2,x);
                z =cashBox.calculateYearlyTurnover(y);
                cashBox.calculateProfitLoss(yb,opening_balance,closing_amount);
                if(cashBox.getProfit() > 0) {
                    System.out.println("Profit:Rs."+cashBox.getProfit());
                }else{
                    System.out.println("Loss:Rs."+cashBox.getLoss());
                }
            }

        }
        System.out.println("Press 3 to Manage employees:");
        yen = sc.nextInt();
        if(yen == 3){
            String nme,eid,eph;
            float esal;
            int u;
            System.out.println("1.Manager\n2.Staff");
            u = sc.nextInt();
            if( u == 1) {
                Employee emp1 = new Manager();
                emp1.createManager();
                emp1.addEmployee();
                emp1.creditSalary();
                emp1.transferEmployee();
                emp1.removeEmployee();
            }else if(u == 2){
                Employee emp2 = new Staff();
                emp2.createStaff();
            }
        }

//----------------------------------------------------------------------------------------------------------
        Customer c1 = new Customer();
        c1.login();
        System.out.println("Press '1' to know delivery availability to your pincode:");
        da = sc.nextInt();
        if(da == 1){
            ea = c1.deliveryAvailability();
            if (ea == false) {
                System.out.println("Delivery to " + c1.getCustomer_address() + " is currently not available for this item");
            }else{
                System.out.println("Delivery Available");
            }
        }else{
            //do nothing
        }

        System.out.println("PRODUCTS\n----------");

            Product[] pro = new Product[5];
            pro[0] = new Product();
            pro[0].setItem_name("Tomato (1 kg)");
            pro[0].setProduct_category("Fruits and Vegetables");
            pro[0].fixPrice(30);
            Date m = new Date();
            m.day = 12;
            m.month = 1;
            m.year = 2022;
            pro[0].setManufacturing_date(m);
            pro[0].setBest_before(12);
            pro[0].fixExpiryDate();

            pro[1] = new Product();
            pro[1].setItem_name("Milk");
            pro[1].setProduct_category("Diary Products");
            pro[1].fixPrice(25);
            Date d = new Date();
            d.day = 2;
            d.month = 1;
            d.year = 2022;
            pro[1].setManufacturing_date(m);
            pro[1].setBest_before(1);
            pro[1].fixExpiryDate();

            pro[2] = new Product();
            pro[2].setItem_name("Chocolate");
            pro[2].setProduct_category("Bakery");
            pro[2].fixPrice(30);
            Date r = new Date();
            r.day = 1;
            r.month = 1;
            r.year = 2022;
            pro[2].setManufacturing_date(r);
            pro[2].setBest_before(12);
            pro[2].fixExpiryDate();

            pro[3] = new Product();
            pro[3].setItem_name("Apple (1 kg)");
            pro[3].setProduct_category("Fruits and Vegetables");
            pro[3].fixPrice(120);
            Date p = new Date();
            p.day = 29;
            p.month = 12;
            p.year = 2021;
            pro[3].setManufacturing_date(p);
            pro[3].setBest_before(3);
            pro[3].fixExpiryDate();

            pro[4] = new Product();
            pro[4].setItem_name("Notebook");
            pro[4].setProduct_category("Stationery");
            pro[4].fixPrice(50);
            Date o = new Date();
            o.day = 29;
            o.month = 12;
            o.year = 2021;
            pro[4].setManufacturing_date(o);
            pro[4].setBest_before(2);
            pro[4].fixExpiryDate();
            for (int i = 0; i < pro.length; i++) {
                System.out.println(pro[i].viewProduct());
                System.out.println("\n");
            }

        System.out.println("Enter 1 to buy, 2 to add products to cart:");
        h = sc.nextInt();
        if(h == 1){
                    System.out.println("Enter product number to buy the product:");
                    int[] buy = new int[5];
                    int j = 0;
                    while(j<buy.length){
                        buy[j]= sc.nextInt();
                        if(buy[j] == 0) {
                            break;
                        }
                        j++;
                    }

                    Cashier cas = new Cashier();
                    cas.generateBill(pro,buy);

                    Delivery deli = new Delivery();
                    deli.setOrderId();
                    deli.setDeliverDate();

                    Payment pay = new Payment();
                    System.out.println("\n\n");
                    pay.setPaymentMode();
        }else if(h == 2){
            System.out.println("Enter product number to add the product to cart:");
            int[] cart_items = new int[5];
            int j = 0;
            while(j<cart_items.length){
                cart_items[j]= sc.nextInt();
                if(cart_items[j] == 0) {
                    break;
                }
                j++;
            }

            Cart cart1 = new Cart();
            ce = cart1.addtoCart(pro,cart_items);
        }


        System.out.println("We value your feedback!!\nPlease give rating (out of 5) and your review on our service");
        FeedBack feed1 = new FeedBack();
        feed1.setRating();
        feed1.setCustomerReview();
        c1.feed = feed1;

        System.out.println("Do you want to return a product?[Y/N]");
        String t = sc.next();
        if(t.equals("Y")){
            System.out.println("Select to return items:");
            for(int i=0;i<ce.size();i++){
                System.out.println(ce.get(i).getItem_name()+"\n");
            }
            while(true){
                v = sc.nextInt();
                if(v == 0){
                    break;
                }
            }
            System.out.println("Return request accepted");
        }else{
            // do ntg
        }

    }
}
