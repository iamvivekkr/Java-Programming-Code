    //Java Program to demonstrate the use of the parameterized constructor.  


public class ParameterizedConstruct {
    //Java Program to demonstrate the use of the parameterized constructor.  
  
    int id;  
    String name;  
    //creating a parameterized constructor  
    ParameterizedConstruct(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    ParameterizedConstruct s1 = new ParameterizedConstruct(111,"Karan");  
    ParameterizedConstruct s2 = new ParameterizedConstruct(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}
