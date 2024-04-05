import java.util.*;

public class ArrayPopulation2 {
    public static void main(String[]args){
        // declares an empty array of size 10 of each of the primitive types
        boolean[] arrBoolean = new boolean[10];
        byte[] byteArr = new byte[10];
        short[] shortArr = new short[10];
        char[] arrChar = new char[10];
        int[] arr = new int[10];
        float[] arrFloat = new float[10];
        long[] arrLong = new long[10];
        double[] arrDouble = new double[10];
         // declares an empty array of size 10 of each of the String types
        String[] arrStr = new String[10];

        // Assigning a value of my choosing to the last index of the arrays that are defined above
        // Alternative To get the final index 
        /*int i=0;
        while ( i<array.length) {
            i++
        }*/
        // To get the final index
        int i=arr.length -1;
        Random random = new Random();
        boolean[] bool_values = {true, false};
        arrBoolean[i] = bool_values[random.nextInt(2)];
        byteArr[i] = (byte)random.nextInt(500);
        shortArr[i] = (short)random.nextInt(1000);
        arrChar[i] = (char)random.nextInt(1000);
        arrFloat[i] = (float)random.nextInt(1000);
        arrLong[i] = (long)random.nextInt(1000);
        arrDouble[i] = (long)random.nextInt(1000);
        arrStr[i] = Integer.toString(random.nextInt(100000));
        arr[i] = random.nextInt(100000);
        //Alternatively Assigning a value of my choosing to the last index of the arrays that are defined 
       /* 
        assigningValueToindexBool(arrBoolean);
        assigningValueToindexByte(byteArr);
        assigningValueToindexShort(shortArr);
        assigningValueToindexInt(arr);
        assigningValueToindexFloat(arrFloat);
        assigningValueToindexLong(arrLong);
        assigningValueToindexFloat(arrFloat);
        assigningValueToindexDouble(arrDouble);
        assigningValueToindexString(arrStr);*/
        // pretty print each element to show the default values
        printArray("boolean array: ", Bool_Conversion(arrBoolean));
        printArray("byte array: ",Byte_Conversion(byteArr));
        printArray("short array: ",Short_Conversion(shortArr));
        printArray("char array: ",Char_Conversion(arrChar));
        printArray("int array: ",arr);
        printArray("float array: ",Float_Conversion(arrFloat));
        printArray("long array: ",Long_Conversion(arrLong));
        printArray("double array: ",Double_Conversion(arrDouble));
        printArray("String array: ",String_Conversion(arrStr));
    }

    /***Converts boolean  values true of false into int 0 and 1
     * @param array of boolean values
     * @return array of integers that respresent an boolean values as numeric values 1 or 0**/
    public static int[] Bool_Conversion(boolean[] bool_arr ) {
        int[] new_arr = new int[10];
        for (int i=0; i< bool_arr.length; i++) {
            new_arr[i] = (bool_arr[i] == false)? 0 : 1;
        }
        return new_arr;
    }
    // Assign a random value of my choosing to the last index of the arrays you defined
   /* public static void assigningValueToindexBool(boolean[] bool_arr ) {
        Random random = new Random();
        boolean[] bool_values = {true, false};
        bool_arr[array.length -1] = bool_values[random.nextInt(2)];
    }*/

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
     // Assign a random value of my choosing to the last index of the arrays you defined
   /* public static void assigningValueToindexByte(byte[] byte_arr ) {
        Random random = new Random();
        byte_arr[array.length -1] = (byte)random.nextInt(500);
    }
*/  
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
    // Assign a random value of my choosing to the last index of the arrays you defined
   /* public static void assigningValueToindexShort(short[] short_arr ) {
        Random random = new Random();
        short_arr[9] = (short)random.nextInt(1000);
    }
*/
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
     // Assign a random value of my choosing to the last index of the arrays you defined
   /* public static void assigningValueToindexChar(char[] char_arr ) {
        Random random = new Random();
        char_arr[9] = (char)random.nextInt(1000);
    }
*/
    public static int[] Float_Conversion(float[] float_arr ) {
        int[] new_arr = new int[10];
        for (int i=0; i< float_arr.length; i++) {
            new_arr[i] = (int)float_arr[i];
        }
        return new_arr;
    }
     // Assign a random value of my choosing to the last index of the arrays you defined
   /* public static void assigningValueToindexFloat(float[] float_arr ) {
        Random random = new Random();
        float_arr[array.length -1] = (float)random.nextInt(1000);
    }*/
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

    /* // Assign a random value of my choosing to the last index of the arrays you defined
    public static void assigningValueToindexLong(long[] long_arr ) {
        Random random = new Random();
        long_arr[9] = (long)random.nextInt(1000);
    }
*/
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
     // Assign a random value of my choosing to the last index of the arrays you defined
    /* public static void assigningValueToindexDouble(double[] long_arr ) {
        Random random = new Random();
        long_arr[array.length -1] = (double)random.nextInt(1000);
    }*/
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
    // Assign a random value of my choosing to the last index of the arrays you defined
   /*  public static void assigningValueToindexString(String[] str_arr ) {
        Random random = new Random();
        str_arr[array.length -1 ] = Integer.toString(random.nextInt(100000));
    }

    public static void assigningValueToindexInt(int[] int_arr ) {
        Random random = new Random();
        int_arr[array.length -1 ] = random.nextInt(100000);
    }*/
    
    /**
     * pretty print each element to show the default values
     * @param  string prefix, array of integers **/
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
