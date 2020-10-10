package addressbook;

public class addressbookcontent {

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	String phNo;
	String email;

	public addressbookcontent(String fname, String lname, String add, String city, String state, int zip, String mobNo,
			String mail) {
		this.firstName = fname;
		this.lastName = lname;
		this.address = add;
		this.city = city;
		this.zip = zip;
		this.phNo = mobNo;
		this.email = mail;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	public String getPhoneNumber() {
		return phNo;
	}

	public String getEmail() {
		return email;
	}

	public void setFirstName(String fname) {
		this.firstName = fname;
	}

	public void setLastName(String lname) {
		this.lastName = lname;
	}

	public void setAddress(String addr) {
		this.address = addr;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZip(int zipc) {
		this.zip = zipc;
	}

	public void setPhoneNumber(String phn) {
		this.phNo = phn;
	}

	public void setEmail(String mail) {
		this.email = mail;
	}
}
