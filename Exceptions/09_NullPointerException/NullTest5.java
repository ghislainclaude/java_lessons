public class NullTest5{
  public static void main(String[]args){
    String f = null ;
    f = "Claude";
    System.out.println("this will cause null pointer exception  "+ f.length());
  }
}
