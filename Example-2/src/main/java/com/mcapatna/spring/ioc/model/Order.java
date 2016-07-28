package com.mcapatna.spring.ioc.model;

public class Order {

	private int o_id;
	private String o_Date;
	private int qty;
	private double cost;
	private String status;

	public int getO_id() {
		return o_id;
	}

	public void setO_id(int o_id) {
		this.o_id = o_id;
	}

	public String getO_Date() {
		return o_Date;
	}

	public void setO_Date(String o_Date) {
		this.o_Date = o_Date;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [o_id=" + o_id + ", o_Date=" + o_Date + ", qty=" + qty + ", cost=" + cost + ", status=" + status
				+ "]";
	}

}
