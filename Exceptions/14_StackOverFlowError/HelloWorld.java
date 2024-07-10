import java.io.*;

abstract class HelloWorld {
    
    public static void main(String[] args) throws FileNotFoundException{
       Animal a = new Animal();
       Animal b = new Horse();
        a.eat();
        b.eat(); 
        System.out.println("Hello ");
       
    }
}

 class Animal {
       public void eat() throws FileNotFoundException {
           System.out.println("Generic Animal Eating Generically");
           throw new FileNotFoundException("Cant find");
       }
       
      /* public void getEat() {
           eat();
       }*/
   }
   
   class Horse extends Animal {
       public void eat() {
           System.out.println("Horse eating hay");
           
       }
   }