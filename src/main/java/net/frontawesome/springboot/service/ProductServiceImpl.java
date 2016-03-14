package net.frontawesome.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.frontawesome.springboot.domain.Product;
import net.frontawesome.springboot.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductRepository productRepository;
	
	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Iterable<Product> getAllProducts() {
		return this.productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		return this.productRepository.findOne(id);
	}

	@Override
	public Product saveProduct(Product product) {
		return this.productRepository.save(product);
	}

	@Override
	public void deleteProduct(Integer id) {
		this.productRepository.delete(id);
	}

}
