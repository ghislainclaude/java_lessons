import java.util.function.*;


public class LambdaRunnable {
	public static void main(String[] args) {
		//Runnable run = new Runnable() {};
		Runnable start = () -> {
			for (int i=0; i< 9; i++) 
			System.out.println("Ghislain-Claude Ilunga");
		};
		new Thread(start).start();
	}
}