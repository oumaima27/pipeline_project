package com.springswagger.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String name;
    private String brand;
    private String madein;
    private float price;
 
    public Product() {
    }
}
