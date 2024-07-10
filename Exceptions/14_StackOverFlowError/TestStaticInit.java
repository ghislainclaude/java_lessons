class TestStaticInit {


    static class TestInner {
        static int b= 10;
        static void Meme() {

        }

        static {
            System.out.println(b);
        }
    }
    
    private static int a = 5;
    sayGreeting hello = new sayGreeting(){
            static final int a= 5;
           /* public void print(){
                System.out.println(a);
            }*/
            
            void Meme() {
                
            }
        };
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        
    }
}

interface sayGreeting{
   /* void print();*/
}