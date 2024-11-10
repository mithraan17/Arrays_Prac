import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sotr {

        public static void main(String[] args) {
            Integer[] arr = {5, 3, 9, 1, 4};

            List<Integer> sortedList = Arrays.stream(arr)
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

            System.out.println(sortedList);  // Output: [9, 5, 4, 3, 1]
        }


}
