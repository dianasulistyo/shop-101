/**
 * 
 */
package com.diana.service;


import java.util.List;

import com.diana.dao.ProductDao;
import com.diana.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dianasulistyo
 *
 */
@Service("productService")
@Transactional(readOnly = true)
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productDao;
	
	
	@Override
	public Product findProduct(int id) {
		return productDao.findProduct(id);
	}


	@Override
	public List<Product> findAllProduct() {
		return productDao.getAllProduct();
	}


	@Override
	@Transactional(readOnly = false)
	public void addProduct(Product product) {
		productDao.saveProduct(product);	
	}


	@Override
	 @Transactional(readOnly = false)
	public void deleteProduct(int id) {
		Product product = productDao.findProduct(id);
		if(product != null)
		{
			productDao.delete(product);
		}
		
	}


	@Override
	public Product findProduct(String barcode) {
		return productDao.findProduct(barcode);
	}


	@Override
	public void deleteProduct(String barcode) {
		Product product = productDao.findProduct(barcode);
		if(product != null)
		{
			productDao.delete(product);
		}
		
	}
}
