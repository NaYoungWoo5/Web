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
		Product move = new Product("P0529", "è�Ǿ�", 5500);
		move.setDescription("�������� �ȶҾ׼�!!");
		move.setCategory("�׼�");
		move.setManufacturer("����");
		move.setUnitsInStock(1);
		move.setCondition("new");

		Product phone = new Product("P020529", "������8", 650000);
		phone.setDescription("������");
		phone.setCategory("�ڵ���");
		phone.setManufacturer("����");
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