
public class ExampleTK {
//This keyword
	int a;
	int b;
	int c;
	
    ExampleTK(int a,int b,int c){
 this.a=a; 
 this.b=b; 
 this.c=c;
    }
    
    
    void display(){
    System.out.println("print:" +a);
    System.out.println("print:" +b);
    System.out.println("print:" +c);
   }
    
  public static void main(String args[]){
	  
	ExampleTK obj=new ExampleTK(4,5,6);
	obj.display();
	
    }
	
	}
