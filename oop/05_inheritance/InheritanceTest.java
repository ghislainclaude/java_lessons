public class InheritanceTest {
	public static void main(String[] args) {
		Parent myVar = new Parent();
		Child myVar2 = new Child();
		
		System.out.println("================The child has:");
		System.out.println("Grand Parents Money :"+myVar.getGrandParentsMoney());
		System.out.println("Parents Money :"+myVar.getParentsMoney());
		System.out.println("Child's Money :"+myVar2.getChildsMoney());
	}
}
