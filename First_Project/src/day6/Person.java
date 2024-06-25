package day6;

public class Person {
	private String name;
	private int age;
	private String phone;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "의 나이는 " + age + "입니다.";
		//사용자 정의에 의해 출력
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
