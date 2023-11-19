package com.itgen.lesson;

import java.util.Objects;
import java.util.Scanner;

public class Purchase {
    private String productName;
    private Dollar price;
    private int quantity;

    public Purchase(Scanner scanner){
        this.productName = scanner.next();

        String price = scanner.next();
        int cents = Integer.parseInt(price);
        this.price = new Dollar(cents);

        String quantity = scanner.next();
        this.quantity = Integer.parseInt(quantity);

    }

    Purchase(String productName, Dollar price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName(){
        return productName;
    }

    public Dollar getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(Dollar price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "productName='" + productName + '\'' +
                ", price=" + price.getValueInCents() +
                ", quantity=" + quantity +
                '}';
    }

    public double finalPrice(){
        return price.getValueInCents() * quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return quantity == purchase.quantity
                && Objects.equals(productName, purchase.productName)
                && Objects.equals(price, purchase.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price, quantity);
    }
}
