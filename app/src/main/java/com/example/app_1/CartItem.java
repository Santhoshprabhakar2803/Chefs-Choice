package com.example.app_1;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class CartItem implements Parcelable {
    private String itemName;
    private String price;
    private int quantity;

    public CartItem(String itemName, String price, int quantity) {
        if (itemName == null || itemName.isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be null or empty");
        }
        if (price == null || price.isEmpty()) {
            throw new IllegalArgumentException("Price cannot be null or empty");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }

        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    protected CartItem(Parcel in) {
        itemName = in.readString();
        price = in.readString();
        quantity = in.readInt();
    }

    public static final Creator<CartItem> CREATOR = new Creator<CartItem>() {
        @Override
        public CartItem createFromParcel(Parcel in) {
            return new CartItem(in);
        }

        @Override
        public CartItem[] newArray(int size) {
            return new CartItem[size];
        }
    };

    public String getItemName() {
        return itemName;
    }

    public String getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(itemName);
        dest.writeString(price);
        dest.writeInt(quantity);
    }

    public static double calculateTotalPrice(List<CartItem> cartItems) {
        double totalPrice = 0;
        for (CartItem item : cartItems) {
            double itemPrice = Double.parseDouble(item.getPrice().replaceAll("[^\\d.]+", ""));
            totalPrice += itemPrice * item.getQuantity();
        }
        return totalPrice;
    }
}
