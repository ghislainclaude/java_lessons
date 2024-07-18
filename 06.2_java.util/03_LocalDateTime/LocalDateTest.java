import java.time.*;

public class LocalDateTest {
    public static void main(String[] args) {
   		 LocalTime currentTime =LocalTime.now();   		 
   		 System.out.println("today Date is : " + currentTime) ;

         int time = currentTime.getMinute();
         System.out.println(time);
         /*boolean isAfter = currentDate.isAfter(LocalTime.of(11, 0));
         System.out.println(isAfter);*/
    }
}
