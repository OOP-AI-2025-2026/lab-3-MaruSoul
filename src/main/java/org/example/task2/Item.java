package org.example.task2;

public class Item {
    private final long id;
    private String name;
    private double price;

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return;
        }

        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < 0) {
           return;
        }

        this.price = price;
    }

    public Item(long _id, String _name, double _price) {
        this.id = _id;
        this.setName(_name);
        this.setPrice(_price);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + this.id +
                ", price=" + this.price +
                ", name='" + this.name + '\'' +
                '}' + "\n";
    }
}
