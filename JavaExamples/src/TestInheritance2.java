class Boss {


  
void work(){System.out.println("working.......");}  
} 


class Employee extends Boss{  
void print(){System.out.println("printing........");}  
void type(){System.out.println("typing1........");}  
}  



class Internstudent extends Employee{  
void type(){System.out.println("typing.......");}  
} 

class TestInheritance2{  
	
public static void main(String args[]){  
	Employee i=new Internstudent();  
i.type();  
i.print();  
i.work();  
}}