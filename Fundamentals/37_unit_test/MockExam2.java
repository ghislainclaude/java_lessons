public class MockExam2 {
	public static void main(String[] args){
        // Intialization 
    	int [] shoesize  =  {11,2,33,4,5,6,7,8,9,10,2,4,6,8,20,1,3,5,10,99,17,2,3,21,5,6,7,8,9,50,13,2,4,32,7,8,4,2,6,8,2,5,43,9,3,5,88,54,4,10};
        int n = 0, j = 0, s = 0, y = 0, t = 0, k = 0;

        // check if intialized variable is smaller then length of array and loop
        while(n < shoesize.length){
            System.out.print(shoesize[n] +" ");
            n++;
            System.out.print(" ");
        }

    	// check if intialized variable is smaller then length of array and loop
    	while(j < shoesize.length){
    	 	int shirt = shoesize[j];
    	 	int pants = shoesize[j]%2;
            // checks of pant is equal to some conditions and execute a statement
    	 	switch(pants){
    	 		case 0:
    	 			System.out.println(shirt);
    	 			break;
    	 	}
    	 	j++;
    	}	

        // check if intialized variable is smaller then length of array and loop
    	while(t < shoesize.length){
    	 	int sock = shoesize[t];
    	 	int shoe = shoesize[t]%11;
            // checks of pant is equal to some conditions and execute a statement
    	 	switch(shoe){
    	 		case 0:
    	 		    System.out.println(sock);
    	 		break;
    	 	}
    	 	t++;
    	}
    	 		
        
        while(s < shoesize.length){
        	System.out.print(shoesize[s] +1);
        	s++;
        	System.out.print(" ");
        }

    	    while(k < shoesize.length){

    	   		int me = shoesize[k] + 1;
    	   		int you = me%2;

    	   		switch(you){
    	   		case 0:
    	   		     System.out.println(me);
    	   		     break;
    	   		}
    	   		k++;
    	   	}
    	   	
    	   	
    	   	while(y < shoesize.length){	

    	   		int us = shoesize[y] + 1;
    	   		int we = us%11;

    	   		switch(we){
    	   			case 0:
    	   		      System.out.println(us);
    	   		      break;
    	   		}
    	   	  y++;
    	    }
	}		
}
