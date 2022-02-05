package com.test.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Product {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private int qty;

    public Product(String name, int qty)
    {
        this.name = name;
        this.qty = qty;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }

    public String getName()
    {
        return this.name;
    }

    public int getQty()
    {
        return this.qty;
    }

    @Override
    public String toString()
    {
        return String.format("Product deets: [id=%s, name=%s, qty=%s]", id, name, qty);
    }
}
