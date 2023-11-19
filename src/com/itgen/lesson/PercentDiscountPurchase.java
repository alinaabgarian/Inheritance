package com.itgen.lesson;

import java.util.Objects;
import java.util.Scanner;

public class PercentDiscountPurchase extends Purchase{
    private double discount;
    private int minNumberOfPurchases;

    public PercentDiscountPurchase(Scanner scanner){
        super(scanner);
        String discount = scanner.next();
        this.discount = Double.parseDouble(discount);

    }


    PercentDiscountPurchase(String productName, Dollar price, int quantity, double discount, int minNumberOfPurchases) {
        super(productName, price, quantity);
        this.discount = discount;
        this.minNumberOfPurchases = minNumberOfPurchases;

        minNumberOfPurchases = 15;

    }


    public double finalPrice(){
        if(getQuantity()>= minNumberOfPurchases){
            return getPrice().getValueInCents() * getQuantity() * (1-discount/100);
        }

        else{
            return getPrice().getValueInCents();
        }
    }

    @Override
    public String toString() {
        return "PercentDiscountPurchase{" +
                "productName=" + getProductName() +
                ", price=" + getPrice().getValueInCents() +
                ", quantity=" + getQuantity() +
                ", discount=" + discount +
                ", minNumberOfPurchases=" + minNumberOfPurchases +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PercentDiscountPurchase that = (PercentDiscountPurchase) o;
        return Double.compare(that.discount, discount) == 0 && minNumberOfPurchases == that.minNumberOfPurchases;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount, minNumberOfPurchases);
    }
}
