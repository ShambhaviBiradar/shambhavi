public class creatingM {
	//methods creation
	 static int a=10;
	 static int b=20;
	 static float c=10.2f;
	 
	  void add(int a,int b,float c){
		 
		  float sum = a+b+c; 
		  
		  
		  int sum1 = (int)(a+b+c);
		  
		  
		System.out.println(" Sum of a,b,c : "+sum);
		
		System.out.println(" Sum of a,b,c : "+sum1);
}
	
	
	
	
	public static void main(String args[]){	
		
		
		creatingM obj = new creatingM();
		
		obj.add(2,2,2.5f);
		obj.add(a,b,c);
		
	}
}