public class PassByREf1 {
	public static void main(String[] args) {
		ValueHolder2 holder2 = new ValueHolder2();
		PassByRef2 byRef2 = new PassByRef2();
		
		holder2.setValue(9001);
		
		System.out.println("Value = "+holder2.getValue());
		
		byRef2.changeValue(holder2);
		
		System.out.println("Value = "+holder2.getValue());
	}
}
