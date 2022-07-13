    //Java program to overload constructors  

public class OverloadingConstr {
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    OverloadingConstr(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    OverloadingConstr(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
        OverloadingConstr s1 = new OverloadingConstr(111,"Karan");  
        OverloadingConstr s2 = new OverloadingConstr(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}  
    
