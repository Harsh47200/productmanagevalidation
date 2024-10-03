package crudeoperation.productManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import crudeoperation.productManagement.pojo.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
