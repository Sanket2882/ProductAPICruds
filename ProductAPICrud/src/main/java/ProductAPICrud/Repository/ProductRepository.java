package ProductAPICrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ProductAPICrud.bean.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
