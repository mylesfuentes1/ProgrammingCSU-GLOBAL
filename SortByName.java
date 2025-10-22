import java.util.Comparator;

public class SortByName implements Comparator<Studentfinder> {
	
	@Override
	public int compare(Studentfinder s1, Studentfinder s2) {
		return s1.name.compareToIgnoreCase(s2.name);
		
	}

}
