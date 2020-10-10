package addressbook;

import java.util.*;
import java.util.stream.Collectors;

public class addressbook_search {

	public static Map<String, ArrayList<addressbookcontent>> cityList = new HashMap<>();
	public static Map<String, ArrayList<addressbookcontent>> stateList = new HashMap<>();

	public int equals_check(ArrayList<addressbookcontent> tmp, addressbookcontent a1) {
		int count = (int) tmp.stream().filter(i -> i.equals(a1)).count();
		System.out.println(count);
		return count;

	}

	/**
	 * to search the names by city
	 */
	public void searchByCity(String city) {
		if (addressbookmain.hm.isEmpty()) {
			System.out.println("No AddressBook Exists, add new AddressBook First");
			System.exit(0);
		}
		for (Map.Entry<String, ArrayList<addressbookcontent>> ab : addressbookmain.hm.entrySet()) {

			List<addressbookcontent> c = ab.getValue().tmp.stream().filter(i -> i.getCity().equals(city))
					.collect(Collectors.toList());
			if (c.size() == 0)
				System.out.println("No entry with city name: " + city + " in addressbook " + ab.getKey());

			else
				for (int j = 0; j < c.size(); j++) {
					System.out.println("AddressBook " + ab.getKey() + " Name " + c.get(j).getFirstName() + " "
							+ c.get(j).getLastName());
				}
		}
	}

	/**
	 * to search by state
	 */
	public void searchByState(String state) {

		if (addressbookmain.hm.isEmpty()) {
			System.out.println("No AddressBook Exists, add new AddressBook First");
			System.exit(0);
		}
		for (Map.Entry<String, ArrayList<addressbookcontent>> ab : addressbookmain.hm.entrySet()) {

			List<addressbookcontent> c = ab.getValue().tmp.stream().filter(i -> i.getCity().equals(state))
					.collect(Collectors.toList());

			if (c.size() == 0)
				System.out.println("No entry with state name: " + state + " in addressbook " + ab.getKey());

			else
				for (int j = 0; j < c.size(); j++)
					System.out.println("AddressBook " + ab.getKey() + " Name " + c.get(j).getFirstName() + " "
							+ c.get(j).getLastName());
		}
	}

	/**
	 * to view name of the person by city
	 */
	public void viewByCity(String city) {
		List<addressbookcontent> c = cityList.get(city);
		for (int j = 0; j < c.size(); j++) {
			System.out.println(c.get(j).getCity());
			System.out.println(" Name " + c.get(j).getFirstName() + " " + c.get(j).getLastName());
		}
	}

	/**
	 * to view name of the person by state
	 */
	public void viewByState(String state) {
		List<addressbookcontent> c = stateList.get(state);
		for (int j = 0; j < c.size(); j++) {
			System.out.println(" Name " + c.get(j).getFirstName() + " " + c.get(j).getLastName());
		}
	}
	
	/**
	 * to sort the address book using first & last name
	 */
	public void viewSortedContactsInAddressBook(String AddressBookName) {
		if(addressbookmain.hm.get(AddressBookName) == null)
		{
			System.out.println("No addressBook with this name, enter correct address book");
			return;
		}
		addressbookmain.hm.get(AddressBookName).tmp.stream().sorted((n1,n2) -> n1.getFirstName().compareTo(n2.getFirstName())).
				                               map(i->i.toString()).forEach(y-> System.out.println(y));
	}

}
