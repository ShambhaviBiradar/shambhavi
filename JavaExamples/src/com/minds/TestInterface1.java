package com.minds;

//Interface declaration: by first user  
interface Designableable{  
void draw();  
}  
//Implementation: by second user  
class Rectangle1 implements Designableable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Designableable{  
public void draw(){System.out.println("drawing circle");}  
}  
//Using interface: by third user  
class TestInterface1{  
public static void main(String args[]){  
	Designableable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
d.draw();  
}}  