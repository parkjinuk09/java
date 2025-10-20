package exam1013;

private class Student {
	String name;
	String email;
	String id;
	
	Student(String name, String email, String id){
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	 public String getName() {
	        return name;
	    }

	 public String setName(String name) {
		 this.name = name;
	 }
	
	 
	 public String getEmail() {
		 return email;
	 }
	 
	 public String setEmail(String email) {
		 this.email = email;
	 }
	 
	 public String getId() {
		 return id;
	 }
	 
	 public String setId(String id) {
		 this.id = id;
	 }
}
