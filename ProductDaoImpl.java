package dao;
import java.util.*;
import model.Product;
import exception.ProductNotFoundException;
public class ProductDaoImpl implements IProductDao {
	Scanner sc=new Scanner(System.in);
	ArrayList<Product> productobjects=new ArrayList<Product>();
	@Override
	public Product addProduct(Product p) {
		
		System.out.println("Enter product ID: ");
		int prodID=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter product name: ");
		String prodName=sc.nextLine();
		System.out.println("Enter product price: ");
		int prodPrice=sc.nextInt();
		System.out.println("Enter product quantity: ");
		int prodQty=sc.nextInt();
		Product product=new Product(prodID, prodName, prodPrice, prodQty);
		productobjects.add(product);
		return product;
	}

	@Override
	public Product deleteProduct(int prdId) {
		for (int i = 0; i < productobjects.size(); i++) 
		{
		  if(productobjects.get(i).getProdID()==prdId) {
			  productobjects.remove(i);
			  break;
		  }
		}
		return null;
	}

	@Override
	public Product updateProduct(int prdId) {
		for (int i = 0; i < productobjects.size(); i++) 
		{
		  if(productobjects.get(i).getProdID()==prdId)
		  {
			  System.out.println("Enter updated product ID: ");
			  int prodID=sc.nextInt();
			  productobjects.get(i).setProdID(prodID);
			  sc.nextLine();
			  System.out.println("Enter updated product name: ");
			  String prodName=sc.nextLine();
			  productobjects.get(i).setProdName(prodName);
			  System.out.println("Enter updated product price: ");
			  int prodPrice=sc.nextInt();
			  productobjects.get(i).setPrice(prodPrice);
			  System.out.println("Enter updated product quantity: ");
			  int prodQty=sc.nextInt();
			  productobjects.get(i).setQtyInHand(prodQty);
			  break;
		  }
		}
		return null;
	}

	@Override
	public Product findProductById(int prdId) throws ProductNotFoundException {
		int flag=0;
		for (int i = 0; i < productobjects.size(); i++) 
		{
		  if(productobjects.get(i).getProdID()==prdId)
		  {
			  System.out.println(productobjects.get(i));
			  flag=1;
			  break;
		  }
		}
		if(flag==0) {
			throw new ProductNotFoundException("Product is not found");
		}
		return null;
	}

	
}
