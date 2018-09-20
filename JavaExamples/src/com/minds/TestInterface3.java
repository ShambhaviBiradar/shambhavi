package com.minds;
//Here Multiple inheritance is not supported through class in java but it is possible by interface


interface Seeable{  
void print();  
} 



interface Watchable{  
void print();  
}


  
class TestInterface3 implements Seeable, Watchable{  

	public void print(){System.out.println("Hello");}  
public static void main(String args[]){  
TestInterface3 obj = new TestInterface3();  
obj.print();  
 }  
} 
