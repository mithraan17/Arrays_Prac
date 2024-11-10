import java.util.Arrays;

public class Descendingsort {

    //going to check element by element
    //create new array and add largest element,followed by second largest
    //till the end of the array

    public static void DescendingSort(int[] arr) {
        int[] Sortedarr = new int[arr.length];
        boolean[] used = new boolean[arr.length]; // To track which elements are already added to Sortedarr

        for (int i = 0; i < arr.length; i++) {
            int largestIndex = -1; // To keep track of the index of the largest element found
            for (int j = 0; j < arr.length; j++) {
                // Check if arr[j] is larger than current largest and not used yet
                if (!used[j] && (largestIndex == -1 || arr[j] > arr[largestIndex])) {
                    largestIndex = j; // Update the index of the largest element
                }
            }

            // If we found a valid largest element, add it to Sortedarr
            if (largestIndex != -1) {
                Sortedarr[i] = arr[largestIndex];
                used[largestIndex] = true; // Mark this element as used
            }
        }

        // Print the sorted array
        for (int i = 0; i < Sortedarr.length; i++) {
            System.out.println(Sortedarr[i]);
        }
    }



    public static void main (String[] args)
    {
        int [] arr= {15,2,10,54,12};
        DescendingSort(arr);
    }



    }







