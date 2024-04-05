public class Array_partial_population {
    public static void main(String[]args){
        // declares an empty array of size 10 of each of the primitive types
        int[] array = new int[10];
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


        int value = 0;
        char char_value = 'A';
        for (int i=5; i<array.length; i++) {
            arrBoolean[i] = i%2 == 0? true : true;
            byteArr[i] = (byte)value;
            shortArr[i] = (short)value;
            arrChar[i] = (char)value;
            arr[i]=value;
            arrLong[i] = (long)value;
            arrFloat[i] = (float)value;
            arrDouble[i] = (double)value;
            arrStr[i] = Integer.toString(i);
            value++;
            char_value++;
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
            value++;
            char_value++;
        }*/
       
        printArray("boolean array: ", arrBoolean);
        printArray("byte array: ", byteArr);
        printArray("short array: ", shortArr);
        printArray("char array: ",arrChar);
        printArray("int array: ",arr);
        printArray("float array: ",arrFloat);
        printArray("long array: ", arrLong);
        printArray("double array: ", arrDouble);
        printArray("String array: ", arrStr);
    }
/*    //  populate each value with an index number of the loop
    public static void populateArrayBoolean(boolean[] arr_bool) {
        for (int i=0; i< arr_bool.length; i++) {
            // checks if the value is a even and assign  true or false 
           arr_bool[i] = i%2 == 0? true : false;
        }
    }
    //  populate each value with an index number of the loop
     public static void populateArrayByte(byte[] arr_byte) {
        for (int i=0; i< arr_byte.length; i++) {
           arr_byte[i] = (byte)i;
        }
    }
    //  populate each value with an index number of the loop
    public static void populateArrayShort(short[] arr_short) {
        for (int i=0; i< arr_short.length; i++) {
           arr_short[i] = (short)i;
        }
    }
    //  populate each value with an index number
    public static void populateArraycChar(char[] arr_char) {
        for (int i=0; i< arr_char.length; i++) {
           arr_char[i] = (char)i;
        }
    }
    //  populate each value with an index number
    public static void populateArrayInt(int[] arr_int) {
        for (int i=0; i< arr_int.length; i++) {
            arr_int[i]=i;
        }
    }
    //  populate each value with an index number of the loop
    public static void populateArrayLong(long[] arr_long) {
        for (int i=0; i< arr_long.length; i++) {
            arr_long[i] = (long)i;
        }
    }
    //  populate each value with an index number of the loop
    public static void populateArrayFloat(float[] arr_float) {
        for (int i=0; i< arr_float.length; i++) {
            arr_float[i] = (float)i;
        }
    }
    //  populate each value with an index number of the loop
    public static void populateArrayDouble(double[] arr_double) {
        for (int i=0; i< arr_double.length; i++) {
            arr_double[i] = (double)i;
        }
    }
    //  populate each value with an index number of the loop
    public static void populateArrayString(String[] arr_Str) {
        for (int i=0; i< arr_Str.length; i++) {
            arr_Str[i] = Integer.toString(i);
        }
    }*/
    
    public static void printArray(String prefix, boolean[] arrayToPrint){
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

    public static void printArray(String prefix, char[] arrayToPrint){
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

    public static void printArray(String prefix, byte[] arrayToPrint){
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

     public static void printArray(String prefix, short[] arrayToPrint){
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

    public static void printArray(String prefix,long[] arrayToPrint){
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

     public static void printArray(String prefix, float[] arrayToPrint){
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

    public static void printArray(String prefix, double[] arrayToPrint){
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


    public static void printArray(String prefix, String[] arrayToPrint){
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