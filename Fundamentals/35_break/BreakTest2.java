public class BreakTest2 {
    public static void main(String[] args) {
    int i = 0;      
            outer: while(i<3){
            System.out.println("outer:"+i);
            int j = 0; 
            inner:while (j<3) {
                System.out.println(" inner:"+j);
                int k = 0;
                if(i == 2){
                 break inner;
                }
                innest:while(k<3){
                    System.out.println("  innest:"+k);
                    k++;
                } 
                j++;            
            } 
            i++;        
        }
    }
}


                
                
                
                           