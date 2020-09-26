package addressbook;

import java.util.*;
public class addressbookmain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Address Book\r\n"
				+ "Program in\r\n"
				+ "AddressBookMain class \r\n"
		         );

		ArrayList<addressbookcontent> list = new ArrayList<>();
		list.add(new addressbookcontent("Utkarsh", "Agrawal", "Chowk", "Prayagraj", 211003, 
				"9044961252", "utkarsh@gmail.com"));
		System.out.println(list.size());
		System.out.println(list.get(0).getFirstName());
		System.out.println("Enter 1 to add or 2 to edit");
		int choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("Enter first name");
			String fname = sc.next();
			System.out.println("Enter last name");
			String lname = sc.next();
			System.out.println("Enter Address");
			String add = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter City");
			String city = sc.next();
			sc.nextLine();
			System.out.println("Enter zip code");
			int zipcode = sc.nextInt();
			System.out.println("Enter Phone Number");
			String ph = sc.next();
			System.out.println("Enter E-Mail");
			String mail = sc.next();
			
			
			list.add(new addressbookcontent(fname, lname, add, city, zipcode, ph, mail));
			
			System.out.println("Contact added successfully");
			break;
		
		case 2:
			System.out.println("Enter first name to edit");
			String first = sc.next();
			sc.nextLine();
			int pos=-1;
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getFirstName().equals(first))
					pos=i;
			}
			System.out.println("Choose the option to edit");
		      System.out.println("1.Edit Last name");
		      System.out.println("2.Edit Address");
		      System.out.println("3.Edit City");
		      System.out.println("4.Edit Zip");
		      System.out.println("5.Edit Phone Number");
		      System.out.println("6.Edit Email");
		      System.out.println("7.Exit");
		      
		      int option = sc.nextInt();
		      if(option == 1)
		    	  list.get(pos).setLastName(sc.next());
		      else if(option == 2) {
		    	  list.get(pos).setAddress(sc.nextLine());
		    	  sc.nextLine();
		      }
		      else if(option == 3)
		    	  list.get(pos).setCity(sc.next());
		      else if(option == 4)
		    	  list.get(pos).setZip(sc.nextInt());
		      else if(option == 5)
		    	  list.get(pos).setPhoneNumber(sc.next());
		      else if(option == 6)
		    	  list.get(pos).setEmail(sc.next());
		      else
		    	  break;
		      System.out.println("Contact updated succesfully");
		      break;
		    default: 
		    	  
		}
	}

}
