package chap06.exercise;

public class Chap06Ex18_ShopService {
	private static Chap06Ex18_ShopService service = new Chap06Ex18_ShopService();

	private Chap06Ex18_ShopService() {
	}

	static Chap06Ex18_ShopService getInstance() {
		return service;
	}
}
