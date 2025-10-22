import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studentfinder> students = new ArrayList<>();

        // Add 10 students
        students.add(new Studentfinder(5, "Samantha", "Las Vegas"));
        students.add(new Studentfinder(2, "Dillon", "Durango"));
        students.add(new Studentfinder(10, "Aiden", "Tucson"));
        students.add(new Studentfinder(3, "Kelley", "Fort Collins"));
        students.add(new Studentfinder(1, "Pam", "San Clemente"));
        students.add(new Studentfinder(8, "Jorge", "Denver"));
        students.add(new Studentfinder(4, "Trenna", "Austin"));
        students.add(new Studentfinder(9, "Julian", "Miami"));
        students.add(new Studentfinder(6, "Patrick", "Reno"));
        students.add(new Studentfinder(7, "Vanessa", "Seattle"));

        System.out.println("Original List:");
        for (Studentfinder s : students)
            System.out.println(s);

        System.out.println("\nSorted by Roll Number:");
        BubbleSort.bubbleSort(students, new RollNo());
        for (Studentfinder s : students)
            System.out.println(s);

        System.out.println("\nSorted by Name:");
        BubbleSort.bubbleSort(students, new SortByName());
        for (Studentfinder s : students)
            System.out.println(s);
    }
}

