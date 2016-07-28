package com.mcapatna.spring.ioc.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 
 * @author mcapatna,The Power House
 * @Since 14 Jul 2016
 * @Details at www.mcapatna.wordpress.com
 */
public class Customer {

	private int cid;
	private String cname;
	private List<String> emails;
	private Set<Long> phones;
	private Map<String, Long> refs;
	private Properties myProperties;
	private Address address;
	private Set<Order> order;

	public int getCid() {
		return cid;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", emails=" + emails + ", phones=" + phones + "\n, refs="
				+ refs + ", myProperties=" + myProperties + ", address=" + address + ",\n order=" + order + "]";
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Set<Long> getPhones() {
		return phones;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public Map<String, Long> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

	public Properties getMyProperties() {
		return myProperties;
	}

	public void setMyProperties(Properties myProperties) {
		this.myProperties = myProperties;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Order> getOrder() {
		return order;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}

	public Customer(int cid, String cname, List<String> emails, Set<Long> phones, Address address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.emails = emails;
		this.phones = phones;
		this.address = address;
	}

}
