package model;

import java.io.Serializable;

public class Book implements Serializable {
    private Integer id;
    private String title;
    private double price;
    private int amount;
    private String pubTime;

    public Book() {
    }

    public Book(Integer id, String title, double price, int amount, String pubTime) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.amount = amount;
        this.pubTime = pubTime;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPubTime() {
        return pubTime;
    }

    public void setPubTime(String pubTime) {
        this.pubTime = pubTime;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", pubTime='" + pubTime + '\'' +
                '}';
    }
}
