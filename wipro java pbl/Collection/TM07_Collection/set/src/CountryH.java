import java.io.*;
import java.util.*;
public class CountryH {
	TreeSet<String> H1 = new TreeSet<>();
	public TreeSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		while(it.hasNext()) {
			if(it.next()==CountryName) {
				return CountryName;
			}
		}
		return "null";
	}
}
