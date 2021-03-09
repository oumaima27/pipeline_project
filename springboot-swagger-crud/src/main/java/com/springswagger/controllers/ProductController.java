package com.springswagger.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.springswagger.models.Product;
import com.springswagger.repositorys.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/getHello")
	public String getHello() {
		return "Test getHello  eiei ";
	}
			
	@GetMapping("/product")
	public List<Product> getProductAll() {
		return productRepository.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable long id) {
		Optional<Product> student = productRepository.findById(id);
		return student.get();
	}
	
	@PostMapping("/product")
	public ResponseEntity<Object> createProduct(@RequestBody Product product){
		Product saveProduct = productRepository.save(product);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(saveProduct.getId()).toUri();
		return ResponseEntity.created(location).build();	
	}
	
	@PutMapping("/product")
	public ResponseEntity<Object> updateProduct(@RequestBody Product product){	
		Optional<Product> studentOptional = productRepository.findById(product.getId());
		
		if(!studentOptional.isPresent()) {
			return ResponseEntity.notFound().build();		
		}		
			productRepository.save(product);
			return ResponseEntity.noContent().build();		
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable long id) {
		productRepository.deleteById(id);
	}
}
