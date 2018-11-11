package com.jwt.dao;

import com.jwt.model.Cart;
import com.jwt.model.CartItem;
import com.jwt.model.Product;
import com.jwt.service.ProductService;
import com.org.dao.UsersService;
import com.org.model.Users;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CartDAOImpl implements CartDao {

	@Autowired
	private ProductService productService;
	@Autowired
	private UsersService usersService;
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void AddCartItem(CartItem cartItem) {

		sessionFactory.getCurrentSession().save(cartItem);

	}

	@Override
	public void EditCart(int counter, int id) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User user = (User) authentication.getPrincipal();
		Users customUser = usersService.getUsersByName(user.getUsername());
		Cart cart = customUser.getCart();
		Product product = productService.getProductById(id);
		CartItem newcartItem = new CartItem();

		List<CartItem> cartItems = cart.getCartItemList();
		boolean notExists = true;
		for (CartItem cartItem : cartItems) {
			if (!cartItem.isDeleted()) {
				if (cartItem.getProduct().getId() == product.getId()) {
					cartItem.setQuantity(cartItem.getQuantity() + counter);
					product.setQuantity(product.getQuantity() - counter);
					cartItem.setProduct(product);
					notExists = false;
					break;
				} else {
					notExists = true;
				}
			}
		}

		if (notExists) {
			newcartItem.setProduct(product);
			newcartItem.setQuantity(counter);
			newcartItem.getProduct().setQuantity(product.getQuantity() - counter);
			newcartItem.setDeleted(false);
			cart.getCartItemList().add(newcartItem);
			newcartItem.setCart(cart);
			System.out.println("inside of  loop of cartItem");
		}

		sessionFactory.getCurrentSession().saveOrUpdate(cart);

	}

	@Override
	public List<Cart> getAllCarts() {

		Query q = sessionFactory.getCurrentSession().createQuery("from Cart");
		List<Cart> carts = (List<Cart>) q.list();

		return carts;
	}

	@Override
	public void deleteCartItems(List<CartItem> cartItemses) {
		for (CartItem cartItem2 : cartItemses) {
			cartItem2.setDeleted(true);
			sessionFactory.getCurrentSession().update(cartItem2);
			// sessionFactory.getCurrentSession().delete(cartItem2);
			sessionFactory.getCurrentSession().flush();
		}
	}

	@Override
	public Cart getCartByCustomer() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User user = (User) authentication.getPrincipal();
		Users customUser = usersService.getUsersByName(user.getUsername());
		Cart carts = customUser.getCart();
		return carts;
	}

	// @Override
	// public List<Product> filterProductsByName(String name) {
	// Query q = sessionFactory.getCurrentSession().createQuery("from Product where
	// name LIKE :name");
	// q.setParameter("name", "%" + name + "%");
	// List<Product> allProducts = (List<Product>) q.list();
	// return allProducts;
	// }
	//
	// @Override
	// public List<Product> filterProducts(String name, float min, float max) {
	// Query q = sessionFactory.getCurrentSession()
	// .createQuery("from Product where price>:min and price<:max and name LIKE
	// :name");
	// q.setParameter("min", min);
	// q.setParameter("max", max);
	// q.setParameter("name", "%" + name + "%");
	// List<Product> allProducts = (List<Product>) q.list();
	// return allProducts;
	// }

}