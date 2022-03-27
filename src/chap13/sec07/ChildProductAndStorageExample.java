package chap13.sec07;

import java.util.Arrays;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");
		System.out.println(product.getCompany()+" "+ product.getModel()+" "+ product.getKinde());
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		System.out.println(tv);
	}
}
