
public class Student{

	 int id=10;  
	 String name="shambhavi"; 
	 
	 
	 
	 
	 void check(){
		 System.out.println("Method@@@@@@");
	 }
	 
	 
	 Student(int a , int b){
		 System.out.println("Constructor@@@@@@" +a);
	 }
	 
	public static void main(String[] args) {
		
		Student std = new Student(5,6);
		
				
		
		std.check();
		
		 
}

}
