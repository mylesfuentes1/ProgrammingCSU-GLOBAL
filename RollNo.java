import java.util.Comparator;

public class RollNo implements Comparator<Studentfinder> {
	
	@Override
	
	public int compare(Studentfinder s1, Studentfinder s2) {
		return Integer.compare(s1.rollno, s2.rollno);
		
	}

}
