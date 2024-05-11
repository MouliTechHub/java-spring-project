package in.moulitechhub.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.moulitechhub.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}