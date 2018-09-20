package com.minds;
//Interface inheritance
interface Walkable{  
void print();  
}  
interface Runnable extends Printable{  
void show();  
}  
class TestInterface4 implements Runnable{  
public void print(){System.out.println("Distance");}  
public void show(){System.out.println("Area");}  
  
public static void main(String args[]){  
TestInterface4 obj = new TestInterface4();  
obj.print();  
obj.show();  
 }  
} 
