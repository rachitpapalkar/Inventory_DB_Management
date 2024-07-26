package dao;
import model.Product;
import exception.ProductNotFoundException;

public interface IProductDao {

	Product addProduct(Product p);
	
    Product deleteProduct(int prdId);
    
    Product updateProduct(int prdId);
    
    Product findProductById(int prdId) throws ProductNotFoundException;
}
