package za.access;

public class SamePackageAccessor {
	public String getProperty() {
		AccessMe access = new AccessMe();
		return access.getName();
	}
}