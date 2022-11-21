package ProductAPICrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ProductAPICrud.bean.Product;
import ProductAPICrud.service.ProductService;


@RestController
public class ProductController {
	@Autowired
	private ProductService productservice;
	
	@GetMapping("/api/products")
    public List<Product> getProduct(){
    return productservice.getProduct();
    }

	@GetMapping("api/products/{id}")
    public Product getProductbyID(@PathVariable int id) throws NotFoundException{
    return productservice.getProductbyID(id);
    }
	
	 @PostMapping("api/products")
	   public Product addproductdata(@RequestBody Product product){
	        return productservice.addproductdata(product);
	    }
	 
	 @PutMapping("api/products/{id}")
	    public Product updateProduct(@PathVariable int id,@RequestBody Product product){
	        return productservice.updateProduct(id,product);
	    }
	 
	 @DeleteMapping("api/products/{id}")
	    public void deleteProduct(@PathVariable int id){
		 productservice.deleteCategory(id);
	    }
	
}
