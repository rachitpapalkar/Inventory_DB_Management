package model;

public class Product {
	
	private int prodID;
	private String prodName;
	private int price;
	private int QtyInHand;
	
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQtyInHand() {
		return QtyInHand;
	}
	public void setQtyInHand(int qtyInHand) {
		QtyInHand = qtyInHand;
	}
	
	
	public Product(int prodID, String prodName, int price, int qtyInHand) {
		super();
		this.prodID = prodID;
		this.prodName = prodName;
		this.price = price;
		QtyInHand = qtyInHand;
	}
	@Override
	public String toString() {
		return "Product [prodID=" + prodID + ", prodName=" + prodName + ", price=" + price + ", QtyInHand=" + QtyInHand
				+ "]";
	}
}
