package service;

import java.util.Scanner;

import constant.StringConstant;
import dao.*;
import exception.ProductNotFoundException;
import model.Product;

public class ProductServiceImpl implements IProductService {
	Scanner sc=new Scanner(System.in);
	IProductDao productDao=new ProductDaoImpl();
	@Override
	public Product addProduct(Product p) {
		Product prod=productDao.addProduct(p);
		return prod;
	}

	@Override
	public Product deleteProduct(int prdId) {
		productDao.deleteProduct(prdId);
		return null;
	}

	@Override
	public Product updateProduct(int prdId) {
		productDao.updateProduct(prdId);
		return null;
	}

	@Override
	public Product findProductById(int prdId) throws ProductNotFoundException {
		Product prod=productDao.findProductById(prdId);
		return null;
	}

}
