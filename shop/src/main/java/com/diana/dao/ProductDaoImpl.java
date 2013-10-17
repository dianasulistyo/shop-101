package com.diana.dao;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.diana.entity.Product;

@Repository("productRepo")
public class ProductDaoImpl extends AbstractDaoImpl<Product, String> implements ProductDao{
	
	protected ProductDaoImpl() {
		super(Product.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product findProduct(int id) {
		return findByCriteria(Restrictions.eq("ID", id)).get(0);
	}

	@Override
	public void saveProduct(Product product) {
		saveOrUpdate(product);
		
	}

	@Override
	public List<Product> getAllProduct() {
		return findAll("Product");
	}

	@Override
	public Product findProduct(String barcode) {
		return findByCriteria(Restrictions.eq("barcode", barcode)).get(0);
	}
	
}
