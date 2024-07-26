package presentation;
import model.Product;
import service.*;
import dao.*;
import exception.ProductNotFoundException;

import java.util.*;
public class main {

	public static void main(String[] args) throws ProductNotFoundException {
		Scanner sc=new Scanner(System.in);
		
		IProductService productService=new ProductServiceImpl();
		int choice;
		
		do
		{
			System.out.println("0. Add Product");
			System.out.println("1. Update Product");
			System.out.println("2. Delete Product");
			System.out.println("3. Find Product by ID");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 0:
				{
					Product proc1= new Product(0, null, 0, 0);
					productService.addProduct(proc1);
					break;
				}
				case 1:
				{
					System.out.println("Enter the product ID of the product you would like to update: ");
					int prodIDinput=sc.nextInt();
					productService.updateProduct(prodIDinput);
					break;
				}
				
				case 2:
				{
					System.out.println("Enter the product ID of the product you would like to delete: ");
					int prodIDinput=sc.nextInt();
					productService.deleteProduct(prodIDinput);
					break;
				}
				
				case 3:
				{
					System.out.println("Enter the product ID of the product you would like to find: ");
					int prodIDinput=sc.nextInt();
					productService.findProductById(prodIDinput);
					break;
				}
				
				case 4:
					break;
					
				default:
				{
					System.out.println("Invalid! Enter choice again:");
					choice=sc.nextInt();
				}
			}
		}while(choice!=4);
		sc.close();
		
		
	}
}
