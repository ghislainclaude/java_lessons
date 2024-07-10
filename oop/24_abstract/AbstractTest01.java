public class AbstractTest01 extends AbstractTest {
	public void doSomething() {
		System.out.println("Doing something");
		doConcrete1();
		doConcrete2();
	}

	public void doConcrete1(){
		System.out.println("Doing something");
	}
	
	public void doConcrete2(){
		System.out.println("Doing something");		
	}
}