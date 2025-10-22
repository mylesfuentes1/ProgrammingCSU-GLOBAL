import java.util.Comparator;
import java.util.ArrayList;

public class BubbleSort {
    // bubble sort method
    public static <T> void bubbleSort(ArrayList<T> list, Comparator<? super T> comp) {
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (comp.compare(list.get(j), list.get(j + 1)) > 0) {
                    // Swap elements
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            // If no swaps occurred, the list is already sorted
            if (!swapped) break;
        }
    }
}
