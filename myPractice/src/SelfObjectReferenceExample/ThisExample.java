package SelfObjectReferenceExample;

public class ThisExample {
	String name;

    public void printMe() {
        System.out.println("내 이름은 " + name);
    }

    public void callMyself() {
        this.printMe();  // this 생략해도 되지만, “내 자신이 이 메서드 호출한다”는 의미로 사용
    }

}
