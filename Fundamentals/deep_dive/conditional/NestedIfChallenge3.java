public class NestedIfChallenge3 {
	public static void main(String[] args) {
		final int option = 2;

		switch (option) {
			case 1:
				switch (option) {
					case 2: 
						switch (option) {
							case 3:
								System.out.println("Option is 3");
							break; 
							default:
								System.out.println("Option is not 3");
							break;
						}
					break;
					default :
						System.out.println("Option is not 2");
					break;
				}
			break;
			default :
				System.out.println("Option is not 1");
			break;
		}


        
/*        if (option == 1)
            if (option == 2)
                if (option == 3)
                    System.out.println("Option is 3");
                else
                    System.out.println("Option is not 3");
            else
                System.out.println("Option is not 2");
        else
            System.out.println("Option is not 1");
*/    }
}