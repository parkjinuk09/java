package constroctorExample01;

public class Person {
	
	String name;
    int age;

    // ① 매개변수가 없는 생성자
    Person() {
        this("Unknown", 0);  // 👈 다른 생성자 호출
        System.out.println("기본 생성자 호출됨");
    }

    // ② 매개변수가 있는 생성자
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("매개변수 있는 생성자 호출됨");
    }
}
