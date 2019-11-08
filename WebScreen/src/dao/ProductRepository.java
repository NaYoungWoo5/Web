package dao;

import java.util.ArrayList;
import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();

	public static ProductRepository getInstance() {
		return instance;
	}

	public ProductRepository() {
		Product move = new Product("P0529", "챔피언", 5500);
		move.setDescription("국내최초 팔뚝액션!!");
		move.setCategory("액션");
		move.setManufacturer("인평");
		move.setUnitsInStock(1);
		move.setCondition("new");

		Product phone = new Product("P020529", "아이폰8", 650000);
		phone.setDescription("아이폰");
		phone.setCategory("핸드폰");
		phone.setManufacturer("애플");
		phone.setUnitsInStock(1);
		phone.setCondition("new");

		listOfProducts.add(move);
		listOfProducts.add(phone);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}

	public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}

	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}