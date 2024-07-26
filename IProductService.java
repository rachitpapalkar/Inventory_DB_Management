package service;

import exception.ProductNotFoundException;
import model.Product;

public interface IProductService {
	

	Product addProduct(Product p);
	
    Product deleteProduct(int prdId);
    
    Product updateProduct(int prdId);
    
    Product findProductById(int prdId) throws ProductNotFoundException;
}
