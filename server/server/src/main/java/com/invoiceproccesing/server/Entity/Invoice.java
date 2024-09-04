package com.invoiceproccesing.server.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Invoice_Data")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String vendor;
	private String product;
	private int amount;
	private String date ;
	private String action;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", vendor=" + vendor + ", product=" + product + ", amount=" + amount + ", date="
				+ date + ", action=" + action + "]";
	}
	public Invoice(Long id, String vendor, String product, int amount, String date, String action) {
		super();
		this.id = id;
		this.vendor = vendor;
		this.product = product;
		this.amount = amount;
		this.date = date;
		this.action = action;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
