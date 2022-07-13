public class DefaultConstruct {
      
        int id;  
        String name;  
        //method to display the value of id and name  
        void display(){System.out.println(id+" "+name);}  
          
        public static void main(String args[]){  
        //creating objects  
        DefaultConstruct s1=new DefaultConstruct();  
        DefaultConstruct s2=new DefaultConstruct();  
        //displaying values of the object  
        s1.display();  
        s2.display();  
        }  
        
}
