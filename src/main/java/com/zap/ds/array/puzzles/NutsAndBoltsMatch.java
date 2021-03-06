package com.zap.ds.array.puzzles;

/**
 * 1. Brute force Way: Start with the first bolt and compare it with each nut until we find a match. In the worst case we require n comparisons. Doing this for all bolts gives us O(n^2) complexity.
 * 2. Quick Sort Way: We can use quick sort technique to solve this. We represent nuts and bolts in character array
 * for understanding the logic.
 *  - Nuts represented as array of character
 *      char nuts[] = {‘@’, ‘#’, ‘$’, ‘%’, ‘^’, ‘&’}
 *  - Bolts represented as array of character
 *      char bolts[] = {‘$’, ‘%’, ‘&’, ‘^’, ‘@’, ‘#’}
 *  a. This algorithm first performs a partition by picking last element of bolts array as pivot, rearrange the array of nuts and returns
 *  the partition index ‘i’ such that all nuts smaller than nuts[i] are on the left side and all nuts greater than
 *  nuts[i] are on the right side. Next using the nuts[i] we can partition the array of bolts. Partitioning
 *  operations can easily be implemented in O(n). This operation also makes nuts and bolts array nicely partitioned.
 *  Now we apply this partitioning recursively on the left and right sub-array of nuts and bolts.
 *  b. As we apply partitioning on nuts and bolts both so the total time complexity will be ?(2*nlogn) = ?(nlogn) on
 *  average.
 * - Here for the sake of simplicity, we have chosen last element always as pivot. We can do randomized quick sort too.
 */
public class NutsAndBoltsMatch {

    // Similar to standard partition method. Here we pass the pivot element
    // too instead of choosing it inside the method.
    private static int partition(char[] arr, int low, int high, char pivot)
    {
        int i = low;
        char temp1, temp2;
        for (int j = low; j < high; j++)
        {
            if (arr[j] < pivot){
                temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
            } else if(arr[j] == pivot){
                temp1 = arr[j];
                arr[j] = arr[high];
                arr[high] = temp1;
                j--;
            }
        }
        temp2 = arr[i];
        arr[i] = arr[high];
        arr[high] = temp2;

        // Return the partition index of an array based on the pivot
        // element of other array.
        return i;
    }
    // Method which works just like quick sort
    private static void matchPairs(char[] nuts, char[] bolts, int low,
                                   int high)
    {
        if (low < high)
        {
            // Choose last character of bolts array for nuts partition.
            int pivot = partition(nuts, low, high, bolts[high]);

            // Now using the partition of nuts choose that for bolts
            // partition.
            partition(bolts, low, high, nuts[pivot]);

            // Recur for [low...pivot-1] & [pivot+1...high] for nuts and
            // bolts array.
            matchPairs(nuts, bolts, low, pivot-1);
            matchPairs(nuts, bolts, pivot+1, high);
        }
    }

    //Driver method
    public static void main(String[] args)
    {
        // Nuts and bolts are represented as array of characters
        char nuts[] = {'@', '#', '$', '%', '^', '&'};
        char bolts[] = {'$', '%', '&', '^', '@', '#'};

        // Method based on quick sort which matches nuts and bolts
        matchPairs(nuts, bolts, 0, 5);

        System.out.println("Matched nuts and bolts are : ");
        printArray(nuts);
        printArray(bolts);
    }

    // Method to print the array
    private static void printArray(char[] arr) {
        for (char ch : arr){
            System.out.print(ch + " ");
        }
        System.out.print("\n");
    }

}
