package exam1020;

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emps = new Employee[2];
		emps[0] = new FullTimeEmployee("김자바", "123456", 4200000);
		emps[1] = new PartTimeEmployee("이파이", "154322", 20000, 160);
		
		
		
		for(int i = 0;i < emps.length;i++) {
			String msg = emps[i].getName() + "," +  emps[i] .calculatePay();
			System.out.println(msg);
		}
	}

}
