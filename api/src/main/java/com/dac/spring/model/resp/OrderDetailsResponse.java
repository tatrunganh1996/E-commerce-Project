package com.dac.spring.model.resp;

public class OrderDetailsResponse {
    private int id;
    private String name;
    private String image;
    private double price;
    private int quantity;

    public OrderDetailsResponse(int id, String name, String image, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
