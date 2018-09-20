package test_collections;

import java.util.*;  

class Book {  
int id;  
String name,author,publisher;  
int quantity;  

public Book(int i, String n, String a, String p, int q) {  
    id = i;  
    name = n;  
    author = a;  
    publisher = p;  
    quantity = q;  
}  
}  
public class ArrayListExample {  
public static void main(String[] args) {  
      
    List<Book> list=new ArrayList<Book>();  
  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",2);  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
     
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    
    for(Book b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
} 
