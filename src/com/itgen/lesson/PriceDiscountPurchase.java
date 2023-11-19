package com.itgen.lesson;

import java.util.Objects;
import java.util.Scanner;

public class PriceDiscountPurchase extends Purchase{
    private int discount;

    public PriceDiscountPurchase(Scanner scanner){
        super(scanner);
        String discount = scanner.next();
        this.discount = Integer.parseInt(discount);
    }
    PriceDiscountPurchase(String productName, Dollar price, int quantity, int discount) {
        super(productName, price, quantity);

        this.discount = discount;
    }

    public double finalPrice(){
        return (getPrice().getValueInCents() - discount)*getQuantity();
    }

    @Override
    public String toString() {
        return "PercentDiscountPurchase{" +
                "productName=" + getProductName() +
                ", price=" + getPrice().getValueInCents() +
                ", quantity=" + getQuantity() +
                ", discount=" + discount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PriceDiscountPurchase that = (PriceDiscountPurchase) o;
        return discount == that.discount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}
