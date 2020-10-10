package addressbook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class addressbook_search {

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

}
