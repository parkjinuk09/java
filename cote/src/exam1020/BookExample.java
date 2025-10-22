package exam1020;

public class BookExample {

	public static void main(String[] args) {
		// TODO	 Auto-generated method stub
		Book[] books = new Book[3];
		
		books[0] = new Book("자바", "김자바", "123-123-123");
		books[1] = new Book("파이썬", "이파이", "123-123-321",50000);
		books[2] = new Book("디비", "박디비", "331-233-423");
		
	
		for(int i = 0;i < books.length;i++) {
			System.out.println(books[i].getTitle());
		}
		
	}

}
