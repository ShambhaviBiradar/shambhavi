package test_collections;



import java.util.*;  
class TestCollection1{  
 public static void main(String args[]){  
 
	 
	 ArrayList<Integer> list=new ArrayList<>(); 
  
 list.add(1); 
  list.add(2);  
  list.add(3);  
  list.add(4);  
 
  Iterator<Integer> itr=list.iterator();
  
  
  
  System.out.println("Chek Iterator:" +itr);
  
  
System.out.println("Chek :" +itr.hasNext());
  while(itr.hasNext()){  
  
	  System.out.println(itr.next());  
  }  
 }  
}  
