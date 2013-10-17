/**
 * 
 */
package com.diana.service;

import java.util.List;

import com.diana.entity.Product;

/**
 * @author dianasulistyo
 *
 */
public interface ProductService {
	public Product findProduct(int productcode);
	public Product findProduct(String barcode);
	public List<Product> findAllProduct();
    void addProduct(Product product);
    void deleteProduct(int id);
    void deleteProduct(String barcode);
}
