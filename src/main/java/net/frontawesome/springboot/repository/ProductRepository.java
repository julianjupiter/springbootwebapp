package net.frontawesome.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import net.frontawesome.springboot.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
