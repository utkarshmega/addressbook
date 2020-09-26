package addressbook;

import java.util.*;
public class addressbookmain {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book\r\n"
				+ "Program in\r\n"
				+ "AddressBookMain class \r\n"
		         );
		
		ArrayList<addressbookcontent> list = new ArrayList<>();
		list.add(new addressbookcontent("Utkarsh", "Agrawal", "Chowk", "Prayagraj", 211003, 
				"9044961252", "utkarsh@gmail.com"));
		
		System.out.println("Contact created successfully");
	}

}
