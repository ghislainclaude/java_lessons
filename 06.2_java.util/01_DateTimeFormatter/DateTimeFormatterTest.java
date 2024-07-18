import java.time.*;
//import java.time.format.DateTimeFormatter;
 
public class DateTimeFormatterTest{
   public static void main(String [] args){
     LocalTime t = LocalTime.parse("10:30:15");
     System.out.println(t.toString());
   }
}
