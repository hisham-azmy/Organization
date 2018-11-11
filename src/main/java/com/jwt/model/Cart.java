package com.jwt.model;

import javax.persistence.*;

import com.org.model.Users;

import java.io.Serializable;
import java.util.List;

@Entity
public class Cart implements Serializable {
	@Id
	@GeneratedValue
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// =============================================================================\\
	/* Mapping */
	// =============================================================================\\

	@OneToMany(mappedBy = "cart", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<CartItem> cartItemList;

	@OneToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	private Orders order;

	@OneToOne(mappedBy = "cart", fetch = FetchType.EAGER /*
															 * , cascade =
															 * CascadeType.ALL
															 */)
	private Users users;

	public List<CartItem> getCartItemList() {
		return cartItemList;
	}

	public void setCartItemList(List<CartItem> cartItemList) {
		this.cartItemList = cartItemList;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Users getCustomer() {
		return users;
	}

	public void setCustomer(Users users) {
		this.users = users;
	}

}
