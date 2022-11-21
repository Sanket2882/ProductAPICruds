package ProductAPICrud.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Categorie {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "categoriId")
	    private int categoriId;
	    private String cName;
	    @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "CategoriID",referencedColumnName = "categoriId")
	    private List<Product> products;
		public int getCategoriId() {
			return categoriId;
		}
		public void setCategoriId(int categoriId) {
			this.categoriId = categoriId;
		}
		public String getcName() {
			return cName;
		}
		public void setcName(String cName) {
			this.cName = cName;
		}
		public List<Product> getProducts() {
			return products;
		}
		public void setProducts(List<Product> products) {
			this.products = products;
		}
		public Categorie(int categoriId, String cName, List<Product> products) {
			super();
			this.categoriId = categoriId;
			this.cName = cName;
			this.products = products;
		}
		public Categorie() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
		
	    
	    
	    
	    
}