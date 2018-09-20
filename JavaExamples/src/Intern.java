
public class Intern{
	

	 int a=10;  
	 String lang1="Shambhavi"; 
	 String lang2="Sabiya";
	 
	 
	 
	 void junior(){
		 System.out.println("Student number" +a);
		 System.out.println("Morning:" +lang1);//method
	 }
	 
	 
	 Intern(double d , int b){
		 System.out.println("Afternoon:" +d);
		 System.out.println("Afternoon:" +b);
		 int c = (int) (d+b);
		 System.out.println("Sum Afternoon:" +c);//constructor
	 }
	 
	public static void main(String[] args) {
		
		Intern obj = new Intern(1.0 ,2);
		
				
		
		obj.junior();
		
		 
}

}

