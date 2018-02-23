package com.squeuesme.restws.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Order")
// means it can beserialized and deserialized
public class Order {

	private long id;
	private String customerID;
	private String venueID;
	private List<Drink> contents;
	
	public Order() {
		contents = new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getVenueID() {
		return venueID;
	}

	public void setVenueID(String venueID) {
		this.venueID = venueID;
	}

	public List<Drink> getContents() {
		return contents;
	}

	public void setContents(List<Drink> contents) {
		this.contents = contents;
	}
	
	public String getIdAsString() {
		return this.id + "";
	}

}
