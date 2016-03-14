package net.frontawesome.springboot.service;

import net.frontawesome.springboot.domain.Product;

public interface ProductService {
	Iterable<Product> getAllProducts();
	Product getProductById(Integer id);
	Product saveProduct(Product product);
	void deleteProduct(Integer id);
}
