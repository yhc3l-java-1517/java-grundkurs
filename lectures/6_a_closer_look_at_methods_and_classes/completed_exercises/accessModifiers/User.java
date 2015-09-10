public class User {
	private String firstname;
	private String lastname;

	User() {
		this.setFirstname("");
		this.setLastname("");
	}

	User(String firstname) {
		this.setFirstname(firstname);
		this.setLastname("");
	}

	User(String firstname, String lastname) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = toProperCase(firstname);
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = toProperCase(lastname);
	}

	public String getUsername() {
		if (getLastname().length() > 0) {
			return getFirstname().toLowerCase() + "."
					+ getLastname().toLowerCase();
		} else {
			return getFirstname().toLowerCase();
		}
	}
	
	private static String toProperCase(String name) {
		if (name.length() > 0) {
			return name.substring(0, 1).toUpperCase()
					+ name.substring(1).toLowerCase();
		} else {
			return "";
		}
	}

}
