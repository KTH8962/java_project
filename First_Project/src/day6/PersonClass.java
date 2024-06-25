package day6;

public class PersonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 20);
		// hong.phone = "123-123"; private이라 접근 불가
		hong.setPhone("123-123");
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getPhone());
		
		System.out.println(hong);
	}

}
