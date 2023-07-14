package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";

    private boolean isCheeseAdded=false;
    private boolean isToppingsAdded=false;
    private boolean isCarryBagAdded=false;
    private boolean isBillGenerated=false;
    private int totalAmount;
    private int toppingsPrice=70;
    private int NonVegtoppingsPrice=120;
    private int cheesePrice=80;
    private int carryBagPrice=20;

    public Pizza(Boolean isVeg){
        this.isVeg=isVeg;
        if(isVeg==true) {
            price = 300;
            bill = bill + "Veg pizza base price : " + price + "\n";
            totalAmount+=price;
        }else{
            price = 400;
            bill = bill + "Non-veg pizza base price: " + price + "\n";
            totalAmount+=price;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isCheeseAdded == false){
            isCheeseAdded=true;
            totalAmount = totalAmount + cheesePrice;
            bill = bill + "Extra cheese added : " + cheesePrice + "\n";
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded) {
            isToppingsAdded = true;
            if(isVeg) {
                totalAmount = totalAmount + toppingsPrice;
                bill = bill + "Extra toppings added : " + toppingsPrice + "\n";
            }else{
                totalAmount = totalAmount + NonVegtoppingsPrice;
                bill = bill + "Extra toppings added : " + NonVegtoppingsPrice + "\n";
            }
        }
    }

    public void addTakeaway(){
        if(!isCarryBagAdded) {
            isCarryBagAdded = true;
            totalAmount = totalAmount + carryBagPrice;
            bill = bill + "Extra carry bag added : " + carryBagPrice + "\n";
        }
    }

    public String getBill(){
        if(isBillGenerated==false){
            isBillGenerated = true;
            bill = bill + "Total bill is equals : "+totalAmount + "\n";
        }
        return this.bill;
    }
}
