package com.example.Entity;






import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {

	@Id
	int id;
	
	@NotEmpty(message="Name should not empty")
	@Size(min=4,max=10,message="size of name must be min 4 and max 5")
	String name;
	
	@NotEmpty(message="Surname should not empty")
	String surname;
	
	
	long mobileno;
	
	@NotBlank(message="Address should not empty")
	String address;

	public Customer(int id, String name, String surname, long mobileno, String address) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.mobileno = mobileno;
		this.address = address;
	}

	public Customer() {
		super();
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
