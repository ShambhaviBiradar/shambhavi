
public class Addition {
	//creating method 
		 static int a=5;
		 static int b=6;
		 static float c=5.2f;
		 
		static void add(int a,int b,float c){
			 
			float sum = a+b+c;
			float add1 = a+b;
			float add2 = a+c;
			
			System.out.println(" Sum of a,b,c : "+sum);
			System.out.println(" Sum of a,b : "+add1);
			System.out.println(" Sum of a,c : "+add2);        
	}	
		
		
		static void add(int a,int b){
		 
		float sum = a+b+c;
		float add1 = a+b;
		float add2 = a+c;
		
		System.out.println(" Sum of a,b,c : "+sum);
		System.out.println(" Sum of a,b : "+add1);
		System.out.println(" Sum of a,c : "+add2);        
}	
		
		static void add(int a,float c){
			 
			float sum = a+b+c;
			float add1 = a+b;
			float add2 = a+c;
			
			System.out.println(" Sum of a,b,c : "+sum);
			System.out.println(" Sum of a,b : "+add1);
			System.out.println(" Sum of a,c : "+add2);        
	}	
		public static void main(String args[]){	
			 

					

			add(a,b,c);
			add(a,b);
			add(a,c);
			
					
					
		}
	}
