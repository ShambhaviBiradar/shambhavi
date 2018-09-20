
public class CMExample {
	//creating constructors and methods
       int p=5;
       String name="Pen"; 
       int days=10;
       float w=0.3f;
 
 	   	    
            CMExample() {
            
            	
            	System.out.println("Thing's property Constructor:");
}
            
                 
            
			void Color(){
            	System.out.println("Thing's property:" +p);
            	            	
            
            }
			 void Thing(){
				 System.out.println("Thing's name:" +name);
			 }
			 
			 void Usage(){
				 System.out.println("Thing's days:" +days);
			 }
			
			 
            public static void main(String args[]){
  			  
    			CMExample obj= new CMExample();
    			
    			obj.Color();
    		
               obj.Usage();
               
           	obj.Thing();
}
}