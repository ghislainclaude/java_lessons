class TestSomething {
    //static int a = 21/0;
    {
        if (true) throw new NullPointerException();
    }
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        /*try {
            RuntimeException re = null;
            throw re;
        }catch (Exception e) {
            System.out.println(e);
        }*/

        /*int i = 0;
        loop: //1 
        {
            System.out.println("Loop lable line");
            try {
                for (;true ; i++) {
                    if (i>5 ) break loop;
                }
            }catch (Exception e) {
                System.out.println("Exception in loop.");
            }finally {
                System.out.println("In finally");
            }
        }*/
       /* System.out.println(new TestSomething().parseFloat("1") );*/
      /* String name = null;
       System.out.println(args.length);
       System.out.println(name.length());*/
       //System.out.println(new TestSomething().toString());
       /*try {
        methodX();
       }catch (Exception e) {
        System.out.println("Exception");
       }*/
       new TestSomething();
        
    }

    /*public float parseFloat(String s) {
        float f = 0.0f;
        try{
            f = Float.valueOf(s).floatValue();
            return f;
        }catch ( NumberFormatException nfe) {
            f = Float.NaN;
            return f;
        }finally {
            System.out.println("finally ");
            return f;
        }
        
    }*/

   /* public static void methodX() throws Exception {
        throw new AssertionError();
    }*/
}