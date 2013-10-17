/**
 * 
 */
package com.diana.dao;

import java.util.List;

import com.diana.entity.Product;

/**
 * @author dianasulistyo
 *
 */
public interface ProductDao {
	   public Product findProduct(int productcode);
	   public Product findProduct(String barcode);
	   public List<Product> getAllProduct();
	   public void saveProduct(Product product);
	public void delete(Product product);
}
