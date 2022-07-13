    //Java Program to demonstrate the use of a static method.  

class StaticKeywords {
    int rollno;  
    String name;  
    static String college = "ITS";  
    //static method to change the value of static variable  
    static void change(){  
    college = "BBDIT";  
    }  
    //constructor to initialize the variable  
    StaticKeywords(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display values  
    void display(){System.out.println(rollno+" "+name+" "+college);}  
}  
//Test class to create and display the values of object  
public class StaticKeyword{  
   public static void main(String args[]){  
    StaticKeywords.change();//calling change method  
   //creating objects  
   StaticKeywords s1 = new StaticKeywords(111,"Karan");  
   StaticKeywords s2 = new StaticKeywords(222,"Aryan");  
   StaticKeywords s3 = new StaticKeywords(333,"Sonoo");  
   //calling display method  
    s1.display(); 
   s2.display();  
   s3.display();  
   }  
}  
