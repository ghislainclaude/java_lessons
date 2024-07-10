public class OwnOuter{
	public OwnOuter() {
		System.out.println("constructing outer.");
	}

	class OwnInner {
		public OwnInner() {
			System.out.println("constructing inner.");
		}
	}

}