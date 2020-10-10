package addressbook;

import java.util.*;

public class addressbookmain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Address Book\r\n" + "Program in\r\n" + "AddressBookMain class \r\n");

		HashMap<String, ArrayList<addressbookcontent>> hm = new HashMap<>();
		System.out.println("Enter 1 to add\n2 to edit \n3 to deleteand \n"
				+ "4 to add new address book \n5 to display \n0 to exit");
		int choice = sc.nextInt();		

		while (choice != 0) {
			switch (choice) {

			case 1:
				System.out.println(hm.keySet());
				System.out.println("Enter the name of the address book you want to add contact");
				String name = sc.next();
				Iterator<String> itr = hm.keySet().iterator();
				ArrayList<addressbookcontent> listtmp = new ArrayList<>();
				while (itr.hasNext()) {
					String tmp = itr.next();
					if (tmp.equals(name))
						listtmp = hm.get(name);
				}
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

				addressbook_search obj = new addressbook_search();
				addressbookcontent a1 = new addressbookcontent(fname, lname, add, city, zipcode, ph, mail);
				
				//to find the duplicate contacts in the address books
				int count = obj.equals_check(listtmp, a1);
				if (count == 0) {
					listtmp.add(a1);
					hm.put(name, listtmp);
					System.out.println("Contact added successfully to " + name);
				} else
					System.out.println("Duplicate contact found");

				break;

			case 2:
				System.out.println(hm.keySet());
				System.out.println("Enter the name of the address book you want to edit");
				String name1 = sc.next();
				Iterator<String> itr1 = hm.keySet().iterator();
				ArrayList<addressbookcontent> listtmp1 = new ArrayList<>();
				while (itr1.hasNext()) {
					String tmp = itr1.next();
					if (tmp.equals(name1))
						listtmp1 = hm.get(name1);
				}
				System.out.println("Enter first name to edit");
				String first = sc.next();
				sc.nextLine();
				int pos = -1;
				for (int i = 0; i < listtmp1.size(); i++) {
					if (listtmp1.get(i).getFirstName().equals(first))
						pos = i;
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
				if (option == 1)
					listtmp1.get(pos).setLastName(sc.next());
				else if (option == 2) {
					listtmp1.get(pos).setAddress(sc.nextLine());
					sc.nextLine();
				} else if (option == 3)
					listtmp1.get(pos).setCity(sc.next());
				else if (option == 4)
					listtmp1.get(pos).setZip(sc.nextInt());
				else if (option == 5)
					listtmp1.get(pos).setPhoneNumber(sc.next());
				else if (option == 6)
					listtmp1.get(pos).setEmail(sc.next());
				else
					break;
				hm.put(name1, listtmp1);
				System.out.println("Contact updated succesfully");
				break;
			case 3:
				System.out.println(hm.keySet());
				System.out.println("Enter the name of the address book you want to edit and delete");
				String name2 = sc.next();
				Iterator<String> itr2 = hm.keySet().iterator();
				ArrayList<addressbookcontent> listtmp2 = new ArrayList<>();
				while (itr2.hasNext()) {
					String tmp = itr2.next();
					if (tmp.equals(name2))
						listtmp2 = hm.get(name2);
				}
				System.out.println("Enter first name to delete the contact");
				String firstdel = sc.next();
				sc.nextLine();
				int pos1 = -1;
				for (int i = 0; i < listtmp2.size(); i++) {
					if (listtmp2.get(i).getFirstName().equals(firstdel))
						pos1 = i;
				}
				listtmp2.remove(pos1);
				hm.put(name2, listtmp2);
				System.out.println("Contact deleted succesfully");

			case 4:
				System.out.println("Enter the name of the address book");
				String addressBookname = sc.next();
				ArrayList<addressbookcontent> list = new ArrayList<>();
				hm.put(addressBookname, list);
				break;

			case 5:
				System.out.println(hm.keySet());
				System.out.println("Enter the name of the address book you want to display");
				String name3 = sc.next();
				Iterator<String> itr3 = hm.keySet().iterator();
				ArrayList<addressbookcontent> listtmp3 = new ArrayList<>();
				while (itr3.hasNext()) {
					String tmp = itr3.next();
					if (tmp.equals(name3))
						listtmp3 = hm.get(name3);
				}
				for (int i = 0; i < listtmp3.size(); i++) {
					System.out.println(listtmp3.get(i).getFirstName());
					System.out.println(listtmp3.get(i).getLastName());
					System.out.println(listtmp3.get(i).getAddress());
					System.out.println(listtmp3.get(i).getCity());
					System.out.println(listtmp3.get(i).getZip());
					System.out.println(listtmp3.get(i).getEmail());
					System.out.println(listtmp3.get(i).getPhoneNumber());
					System.out.println();
				}
				break;

			default:
			}
			System.out.println(
					"Enter 1 to add\n2 to edit \n3 to delete \n4 to add new address book \n5 to display \n0 to exit");
			choice = sc.nextInt();
		}
		sc.close();
	}

}