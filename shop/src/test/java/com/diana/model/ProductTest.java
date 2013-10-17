/**
 * 
 */
package com.diana.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.diana.entity.Product;
import com.diana.service.ProductService;

/**
 * @author dianasulistyo
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:hibernateContext.xml"})
public class ProductTest {

	@Autowired
    private ProductService service;

	@Test
	public void testProduct() {
		Product p = service.findProduct(1);
        assertEquals("Apple", p.getName());
	}
	
	@Test
	public void testAddProduct()
	{
		Product p1 = new Product();
		p1.setName("Durian");
		p1.setPrice(24.81);
		p1.setBarcode("D92876");
		
		service.addProduct(p1);
		
		Product p = service.findProduct("D92876");
        assertEquals("Durian", p.getName());
	}
	
	@Test
	public void testAllProducts() {
		List<Product> productList = service.findAllProduct();
        assertEquals(2, productList.size());
	}
	
	@Test
	public void testDeleteProduct()
	{
		service.deleteProduct("D92876");
		
		Product p = service.findProduct("D92876");
		System.out.println(p.getBarcode());
        assertTrue(p==null);
	}

}
