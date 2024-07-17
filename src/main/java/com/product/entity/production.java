package com.product.entity;

public class production {
	
	int pid;
	String name;
	int pty;
	int price;
	public production() {
		super();
		// TODO Auto-generated constructor stub
	}
	public production(int pid, String name, int pty, int price) {
		super();
		this.pid = pid;
		this.name = name;
		this.pty = pty;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPty() {
		return pty;
	}
	public void setPty(int pty) {
		this.pty = pty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "production [pid=" + pid + ", name=" + name + ", pty=" + pty + ", price=" + price + "]";
	}
	

}
