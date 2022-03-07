package chap11.sec03.art04;

public class MemberExample {
	public static void main(String[] args) {
		// 원본 객체 생성
		Member original = new Member("blue","홍길동","12345",25,true,new Car("소나타"));
		
		// 복제 객체를 얻은 후에 패스워드 변경
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		// 얕은 복제의 경우 참조 타입 필드는 번지만 복제되기 때문에 원본 객체의 필드와 복제본 객체의 필드는 같은 객체를 참조함.
		// 따라서 복제본에서 참조 타입 필드를 수정하면 원본의 객체 필드도 수정이 됨.
		cloned.car.model="코란도";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: "+cloned.id);
		System.out.println("name: "+cloned.name);
		System.out.println("password: "+cloned.password);
		System.out.println("age: "+cloned.age);
		System.out.println("adult: "+cloned.adult);
		System.out.println("* Car객체 주소: "+cloned.car.hashCode());
		System.out.println("* car: "+cloned.car.model);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: "+original.id);
		System.out.println("name: "+original.name);
		System.out.println("password: "+original.password);
		System.out.println("age: "+original.age);
		System.out.println("adult: "+original.adult);
		System.out.println("* Car객체 주소: "+original.car.hashCode());
		System.out.println("* car: "+original.car.model);
		
	}
}
