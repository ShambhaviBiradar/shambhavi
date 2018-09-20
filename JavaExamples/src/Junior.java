

 class SuperJunior{
    int a;
    

    void displya(){
    	System.out.println("Method Here@@@@@@");
    }
    
    
    SuperJunior(int a){
		this.a=a;
		
		System.out.println("Show "+a);
	}

}

     



public class Junior{
	
int a;
    	   
		public static void main(String[] args) {
			
			
			SuperJunior obj = new SuperJunior(5);
			Junior obj1 = new Junior();
		
			obj.displya();
	System.out.println(" Show Here " +obj1.a);

	}
}