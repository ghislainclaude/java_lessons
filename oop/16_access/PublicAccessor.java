import za.access.AccessMe;

public class PublicAccessor {
	public String getProperty() {
		AccessMe access = new AccessMe();
		return access.getName();
	}
}