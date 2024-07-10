public class EncapsulationMain {
	public static void main(String[] args) {
		Encapsulation02 encap = new Encapsulation02();
		encap.setName("Ghislain-Claude");
		encap.setSurname("Ilunga");
		System.out.print("Hello, "+ encap.getName() + " " + encap.getSurname());
	}
}