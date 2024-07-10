public class Constructor3 {
    public Constructor3(){
   	 //System.out.println("Running no-args constructor");
    }
    
    public Constructor3(String name){
   	 this();
   	 System.out.print(""+name);
    }

    public Constructor3(String name, String surname, String job){
     this(name);
     System.out.print(" "+ surname + " is a "+job); 
    }
}
