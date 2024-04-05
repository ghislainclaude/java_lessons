import java.util.*;

public class ArrayPopulation1 {
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

        // Alternative 
        /*int[] new_arr = new int[10];
        int[] new_arr1 = new int[10];
        int[] new_arr2 = new int[10];
        int[] new_arr3 = new int[10];
        int[] new_arr4 = new int[10];
        int[] new_arr5 = new int[10];
        int[] new_arr6 = new int[10];
        int[] new_arr7 = new int[10];
        int[] new_arr8 = new int[10];
        int i=0;
        while( i< arrBoolean.length) {
            new_arr[i] = (arrBoolean[i] == false)? 0 : 1;
            new_arr1[i] = byteArr[i];
            new_arr2[i] = shortArr[i];
            new_arr3[i] = arrChar[i];
            new_arr4[i] = (int)arrFloat[i];
            new_arr5[i] = (int)arrLong[i];
            new_arr6[i] = (int)arrDouble[i];
            new_arr7[i] = arrStr[i] == null? 0: Integer.parseInt(str_arr[i]);
            i++;
        }*/
        // Call the printArray method to pretty print each element to show the default values
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
