package ProductAPICrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import ProductAPICrud.Repository.ProductRepository;
import ProductAPICrud.bean.Categorie;
import ProductAPICrud.bean.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productrepository;

	public List<Product> getProduct() {
		  return productrepository.findAll();
	}

	public Product getProductbyID(int id) throws NotFoundException {
		 Optional<Product> product = productrepository.findById(id);
	        if(!product.isPresent())
	                throw new NotFoundException();
	        return product.get();
	    }

	public Product addproductdata(Product product) {
		return productrepository.save(product);
	}

	public Product updateProduct(int id, Product product) {
		 return productrepository.save(product);
	}

	public void deleteCategory(int id) {
		productrepository.deleteById(id);
		
	}
}


