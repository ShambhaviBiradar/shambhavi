abstract class Bike{  
  abstract void run();  
}  
class Demo_Abstract extends Bike{  
void run(){System.out.println("running safely..");}  
public static void main(String args[]){  
 Bike obj = new Demo_Abstract();  
 obj.run();  
}  
}  