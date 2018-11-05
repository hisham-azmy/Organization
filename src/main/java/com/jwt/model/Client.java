package com.jwt.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min = 3, message = "Name must be between 3 an 8")
	private String name;
	// @Size(min = 3, max = 8, message = "email must be between 3 an 8")
	@NotEmpty(message = "shouldnt be empty")
	@Email(message = "should have form of email ")
	private String email;

	private String country;

	private String telephone;

	private String address;

	private String job;

	private String nameOfShop;

	private Date DateOfcreationContact;

	@Transient
	private MultipartFile productImage;

	@Size(min = 3, max = 8, message = "password must be between 3 an 8")
	private String password;

	private boolean enabled;

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getNameOfShop() {
		return nameOfShop;
	}

	public void setNameOfShop(String nameOfShop) {
		this.nameOfShop = nameOfShop;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	public Date getDateOfcreationContact() {
		return DateOfcreationContact;
	}

	public void setDateOfcreationContact(Date dateOfcreationContact) {
		DateOfcreationContact = dateOfcreationContact;
	}

	// =============================================================================\\
	/* Mapping */
	// =============================================================================\\

	// public String getJob() {
	// return job;
	// }
	//
	// public void setJob(String job) {
	// this.job = job;
	// }
	//
	// public String getNameOfShop() {
	// return nameOfShop;
	// }
	//
	// public void setNameOfShop(String nameOfShop) {
	// this.nameOfShop = nameOfShop;
	// }
	//
	// public String getDateOfcreationContact() {
	// return DateOfcreationContact;
	// }
	//
	// public void setDateOfcreationContact(String dateOfcreationContact) {
	// DateOfcreationContact = dateOfcreationContact;
	// }
	//
	// public List<Orders> getOrder() {
	// return order;
	// }
	//
	// public void setOrder(List<Orders> order) {
	// this.order = order;
	// }
	//
	// public String getTelephone() {
	// return telephone;
	// }
	//
	// public void setTelephone(String telephone) {
	// this.telephone = telephone;
	// }
	//
	// public String getAddress() {
	// return address;
	// }
	//
	// public void setAddress(String address) {
	// this.address = address;
	// }
	//
	// public boolean isEnabled() {
	// return enabled;
	// }
	//
	// public void setEnabled(boolean enabled) {
	// this.enabled = enabled;
	// }
	//
	// @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	// private Cart cart;
	//
	// @ManyToMany
	// @JoinTable
	// private List<Role> roles;
	//
	// @OneToMany(mappedBy = "cust", cascade = CascadeType.ALL)
	// private List<Orders> order;
	//
	// public Cart getCart() {
	// return cart;
	// }
	//
	// public void setCart(Cart cart) {
	// this.cart = cart;
	// }
	//
	// public List<Role> getRoles() {
	// return roles;
	// }
	//
	// public void setRoles(List<Role> roles) {
	// this.roles = roles;
	// }

}
