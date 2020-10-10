package addressbook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class addressbook_search{
	
	public int equals_check(ArrayList<addressbookcontent> tmp, addressbookcontent a1)
	{
		int count = (int) list.stream().filter(i->i.equals(a1)).count();
		return count;
		
	}

}
