public class ArrayPopulation5 {
    public static void main(String[]args){
        // Intialize source arrays 
        int[] src_array = new int[10];

        // Intialize destination
        int[] des_array = new int[10];
        boolean[] des_boolean = new boolean[10];
        byte[] des_byte = new byte[10];
        short[] des_short = new short[10];
        char[] des_char = new char[10];
        float[] des_float = new float[10];
        long[] des_Long = new long[10];
        double[] des_double = new double[10];

        String[] desStr = new String[10];

        //populate source with position+20 as index value
        int value = 0;
        char char_value = (char)('A'+20);
        for (int i=0; i<src_array.length; i++) {
            src_array[i]=value+ 20;
            value++;
            char_value++;
        }
        //alternatively populate source with position+20 as index value
        /*if (i<array.length ) {
            do 
            {
                src_boolean[i] = i%2 == 0? true : true;
                src_byte[i] = (byte)(value + 20);
                src_short[i] = (short)(value+20);
                src_array[i] = (char)(value+ 20);
                src_array[i]=value+ 20;
                src_Long[i] = (long)value + 20;
                src_float[i] = (float)value + 20;
                src_double[i] = (double)value + 20;
                srcStr[i] = Integer.toString(i+ 20 );
                src_Str++;
                char_value++;   
            }while (i<array.length);
        }
*/
       
        printArray("Source int before copy: ",src_array);
        System.out.println();
        printArray("Destination boolean before copy : ", Bool_Conversion(des_boolean));
        printArray("Destination byte before copy: ",Byte_Conversion(des_byte));
        printArray("Destination short before copy: ",Short_Conversion(des_short));
        printArray("Destination char before copy: ",Char_Conversion(des_char));
        printArray("Source float before copy: ",Float_Conversion(des_float));
        printArray("Destination long before copy: ",Long_Conversion(des_Long));
        printArray("Destination double before copy: ",Double_Conversion(des_double));
        printArray("Destination string before copy: ",String_Conversion(desStr));
        System.out.println();
        //write a for loop that copies all the values in source to destination. Do not use System.arraycopy()
        for (int i=0; i< (src_array.length -7); i++) {
            des_array[i] = src_array[i];
            des_boolean[i] = src_array[i]%2 == 0? true : true;
            des_byte[i] = (byte)src_array[i];
            des_short[i] = (short)src_array[i];
            des_char[i] = (char)src_array[i] ; 
            des_float[i] = src_array[i];
            des_Long[i] = src_array[i];
            des_double[i] = src_array[i];

            desStr[i] = Integer.toString(src_array[i]);

        }
        // use assignment to assign values to matching indexes
        System.out.println();
        printArray("Source int after copy: ",src_array);
        System.out.println();
        printArray("Destination boolean after copy : ", Bool_Conversion(des_boolean));
        printArray("Destination byte after copy: ",Byte_Conversion(des_byte));
        printArray("Destination short after copy: ",Short_Conversion(des_short));
        printArray("Destination char after copy: ",Char_Conversion(des_char));
        printArray("Source float after copy: ",Float_Conversion(des_float));
        printArray("Destination long after copy: ",Long_Conversion(des_Long));
        printArray("Destination double after copy: ",Double_Conversion(des_double));
        printArray("Destination string after copy: ",String_Conversion(desStr));
    }

     
     /***Converts boolean  values true of false into int 0 and 1
     * @param array of boolean values
     * @return array of integers that respresent an boolean values as numeric values 1 or 0**/
    public static int[] Bool_Conversion(boolean[] bool_arr ) {
        int[] new_arr = new int[10];
        for (int i=0; i< bool_arr.length; i++) {
            // checks if the default value of boolean then 0 is assigned and if not the 1 is assigned
            new_arr[i] = (bool_arr[i] == false)? 0 : 1;
        }
        // return an int array of numeric values representing booleans 
        return new_arr;
    }
    /***Cast bytes into integer
     * @param array of byte values
     * @return array of integers of casted bytes to integer **/
    public static int[] Byte_Conversion(byte[] byte_arr ) {
        int[] new_arr = new int[10];
        for (int i=0; i< byte_arr.length; i++) {
            new_arr[i] = byte_arr[i];
        }
        return new_arr;
    }
    /***Cast short into integer
     * @param array of shroty values
     * @return array of integers of casted shorst to integer **/
    public static int[] Short_Conversion(short[] short_arr) {
         int[] new_arr = new int[10];
        for (int i=0; i< short_arr.length; i++) {
            new_arr[i] = short_arr[i];
        }
        return new_arr;
    }
    /***Cast char into integer
     * @param array of char values
     * @return array of integers of casted chars to integer **/
    public static int[] Char_Conversion(char[] char_arr ) {
        int[] new_arr = new int[10];
        for (int i=0; i< char_arr.length; i++) {
            new_arr[i] = char_arr[i];
        }
        return new_arr;
    }
    /***Cast float into integer
     * @param array of char values
     * @return array of integers of casted float to integer **/
    public static int[] Float_Conversion(float[] float_arr ) {
        int[] new_arr = new int[10];
        for (int i=0; i< float_arr.length; i++) {
            new_arr[i] = (int)float_arr[i];
        }
        return new_arr;
    }
    /***Cast long into integer
     * @param array of long values
     * @return array of integers of casted long to integer **/
    public static int[] Long_Conversion(long[] long_arr ) {
        int[] new_arr = new int[10];
        for (int i=0; i< long_arr.length; i++) {
            new_arr[i] = (int)long_arr[i];
        }
        return new_arr;
    }
     /*** Cast double into integer
     * @param array of double values
     * @return array of integers of casted doubles to integer **/
    public static int[] Double_Conversion(double[] double_arr ) {
        int[] new_arr = new int[10];
        for (int i=0; i< double_arr.length; i++) {
            new_arr[i] = (int)double_arr[i];
        }
        return new_arr;
    }
    /*** Converts String into integer
     * @param array of string values
     * @return array of integers of converted string to integer **/
    public static int[] String_Conversion(String[] str_arr ) {
        int[] new_arr = new int[10];
        for (int i=0; i< str_arr.length; i++) {
            new_arr[i] = str_arr[i] == null? 0: Integer.parseInt(str_arr[i]);
        }
        return new_arr;
    }
    
     

    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    

        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
            	System.out.print(",");
            }         
        }
        System.out.print("]\n");
    }
}
