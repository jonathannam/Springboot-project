package com.example.SpringMongoProject.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "barchart")
public class Chart {
    @Id
    private String _id;
    private String name;
    private int quantity;

    public Chart(String _id, String name, int quantity) {
        this._id = _id;
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
