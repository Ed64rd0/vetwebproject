package com.vet.maestria.domain.customer;

/**
 * Class used to represent all the customer
 * information.
 *
 */
public class Customer {

	private int id;
	private String name;
	private String lastName;
	private String address;
	private String phone;
	private String cel;
	private String email;
	private String colony;

	public Customer() {}
	
	public Customer(int id, String name, String lastName, String address, String phone,
			String cel, String email, String colony) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.cel = cel;
		this.email = email;
		this.colony = colony;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

}
