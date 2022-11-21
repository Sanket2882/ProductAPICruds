package ProductAPICrud.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
	@Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ProductId")
    private int pId;
	private String pname;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return pname;
	}
	public void setName(String name) {
		this.pname = name;
	}
	public Product(int pId, String name) {
		super();
		this.pId = pId;
		this.pname = name;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
 
	
	 
	
	
     
}