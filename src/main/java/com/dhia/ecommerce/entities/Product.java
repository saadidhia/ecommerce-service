package com.dhia.ecommerce.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="sku")
	private String sku;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="unit_price")
	private BigDecimal unitPrice;
	@Column(name="image_url")
	private String imageUrl;
	@Column(name="active")
	private boolean active;
	@Column(name="units_in_stock")
	private int unitsInStock;
	@Column(name="date_created")
	private Date dateCreated;
	@Column(name="last_updated")
	private Date lastUpdated;
	
	
	

}
