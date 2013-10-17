package com.diana.entity;
// default package


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author dianasulistyo
 */
@Entity
@Table(name="PRODUCT",schema="borobudur")
public class Product  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Fields
	 @Id     
	 @Column(name="ID", unique=true, nullable=false)
     private int ID;
	 
	 @Column(name="NAME", length=70)
     private String name;
	 
	 @Column(name="PRICE", precision=52, scale=0)
     private Double price;
	 
	 @Column(name="barcode", unique=true, nullable=false, length=70)
	 private String barcode;
   

    // Constructors

    /** default constructor */
    public Product() {
    }

	/** minimal constructor */
    public Product(int productcode) {
        this.ID = productcode;
    }
    
    /** full constructor */
    public Product(int id, String name, Double price, String barcode) {
        this.ID = id;
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

   
    // Property accessors
   
    public int getID() {
        return this.ID;
    }
    
    public void setID(int id) {
        this.ID = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
   
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return barcode.equals(product.barcode);
    }

    @Override
    public int hashCode() {
        return 13 * barcode.hashCode();
    }

}