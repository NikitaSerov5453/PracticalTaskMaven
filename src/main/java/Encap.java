public class Encap{
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("");
		person1.setAge(-1);
		person1.speak();
		Dog sharik = new Dog();
		sharik.bark();
	}
}
class Person{
	private String name;
	private int age;

	public void setName(String userName){
		if (userName.isEmpty()){
			System.out.println("Введено не корректное имя.");
		}else {
			name = userName;}
	}
	public String getName(){
		return name;
	}

	public void setAge(int userAge){
		if (userAge<0){
			System.out.println("Не корректный возраст.");
		}else{
			age = userAge;}
	}

	public int getAge() {
		return age;
	}

	void speak(){
		System.out.println("Меня зовут " + getName());
		System.out.println("Мне " + getAge() + " Лет");
	}
}
class Dog{
	public void bark(){
		System.out.println("Dog is barking");
	}
}