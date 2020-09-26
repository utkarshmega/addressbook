package addressbook;

public class addressbookcontent {
	
	String firstName;
	String lastName;
	String address;
	String city;
	int zip;
	String phNo;
	String email;
	
	public addressbookcontent(String fname, String lname, String add, String city,
			int zip, String mobNo, String mail)
	{
		this.firstName = fname;
		this.lastName = lname;
		this.address = add;
		this.city = city;
		this.zip = zip;
		this.phNo = mobNo;
		this.email = mail;
	}	

}
