package com.minds;
//using static method in interface

interface Designable{  
void draw();  
static int cube(int x){return x*x*x;}  
}  


class Triangle implements Designable{  
public void draw(){System.out.println("drawing rectangle");}  
}  


  
class TestInterfaceStatic{  
public static void main(String args[]){  

	
	Designable d=new Triangle();  
             d.draw();  
System.out.println(Designable.cube(3));  
}

}  