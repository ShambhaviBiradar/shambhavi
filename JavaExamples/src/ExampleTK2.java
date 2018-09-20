
public class ExampleTK2 {
//This Keyword
	
			int a;
			float f1;
			float f2;
	
			
		    ExampleTK2(int a,float f1,float f2){
		 
	this.a=a; 
	this.f1=f1;
	this.f2=f2;
	

		     
		    }
		    
		     void interns(){
		    System.out.println("Number of Students:" +a);
		    System.out.println("CS under cgpa:" +f1);
		    System.out.println("IS under cgpa:" +f2);
	
		   }
		    
		  public static void main(String args[]){
			  
			ExampleTK2 obj=new ExampleTK2(1,2,3);
			
			obj.interns();
			
		    }
			
			}

