package com.springcrud.demo.model;

//import java.util.List;

import javax.persistence.*;

import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@Table(name ="products")
public class Product {
	
	private int pid;
	private String productName;
	private int qty;
	private int price;

	public Product() {	
	}
	
	public Product(int pid, String productName, int qty, int price ) {
		this.pid = pid;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getproductName() {
        return productName;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
