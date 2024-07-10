public class Anonymous01Main {
	public static void main(String[] args) {
		
		String name = "mr x";
		
		Anonymous01 superX = new Anonymous01(){
			 @Override public void doSomething() {
				System.out.println(name+ ":Doing something ...");
			}
		};
		
		
		superX.doSomething();
	}
}
