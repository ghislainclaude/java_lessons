public class initialisation {
    public static void main(String[]args){
        int[] array = new int[10];
        boolean[] arrBoolean = new boolean[10];
        byte[] byteArr = new byte[10];
        short[] shortArr = new short[10];
        char[] arrChar = new char[10];
        int[] arr = new int[10];
        float[] arrFloat = new float[10];
        long[] arrLong = new long[10];
        double[] arrDouble = new double[10];

        String[] arrStr = new String[10];


        //Write a for loop that populates -1 into the array.
        int value = -1;
        char char_value = 'a';
        for (int i=0; i<array.length; i++) {
            arrBoolean[i] = i%2 == 0? true : true;
            byteArr[i] = (byte)value;
            shortArr[i] = (short)value;
            arrChar[i] = char_value;
            arr[i]=value;
            arrFloat[i] = (long)value;
            arrFloat[i] = (float)value;
            arrDouble[i] = (double)value;
            arrStr[i] = Integer.toString(i);
        }
        // Alternatrive
       /* int i=0;
        while ( i<array.length) {
            arrBoolean[i] = i%2 == 0? true : true;
            byteArr[i] = (byte)value;
            shortArr[i] = (short)value;
            arrChar[i] = (char)value;
            arr[i]=value;
            arrFloat[i] = (long)value;
            arrFloat[i] = (float)value;
            arrDouble[i] = (double)value;
            arrStr[i] = Integer.toString(i);
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
