 // 1. Add integer values of an array 
// public class SumArray {
  // public static void main(String[] args) {
    // int[] arr = {1, 2, 3, 4, 5};
    // int sum = 0;
    // for (int num : arr) sum += num;
    // System.out.println("Sum: " + sum);
  // }
// }

// 2. Calculate average value of an array
 // public class AverageArray {
  // public static void main(String[] args) {
    // int[] arr = {2, 4, 6, 8};
    // int sum = 0;
    // for (int num : arr) sum += num;
    // double avg = (double) sum / arr.length;
    // System.out.println("Average: " + avg);
  // }
// }

// 3. Find index of an array element
 // public class FindIndex {
  // public static void main(String[] args) {
    // int[] arr = {10, 20, 30, 40};
    // int target = 30;
    // int index = -1;
    // for (int i = 0; i < arr.length; i++) {
      // if (arr[i] == target) {
        // index = i;
        // break;
      // }
    // }
    // System.out.println("Index: " + index);
  // }
// }

// 4. Check if array contains a specific value
 // public class ContainsValue {
  // public static void main(String[] args) {
    // int[] arr = {5, 10, 15};
    // int value = 10;
    // boolean found = false;
    // for (int num : arr) {
      // if (num == value) {
        // found = true;
        // break;
      // }
    // }
    // System.out.println("Contains: " + found);
  // }
// }

// 5. Remove specific element from an array
 // public class RemoveElement {
  // public static void main(String[] args) {
    // int[] arr = {1, 2, 3, 4};
    // int remove = 3;
    // int[] newArr = new int[arr.length - 1];
    // int j = 0;
    // for (int i = 0; i < arr.length; i++) {
      // if (arr[i] != remove) {
        // newArr[j++] = arr[i];
      // }
    // }
    // for (int num : newArr) System.out.print(num + " ");
  // }
// }

// 6. Copy an array
 // public class CopyArray {
  // public static void main(String[] args) {
    // int[] original = {1, 2, 3};
    // int[] copy = new int[original.length];
    // System.arraycopy(original, 0, copy, 0, original.length);
    // for (int num : copy) System.out.print(num + " ");
  // }
// }

// 7. Insert an element at a specific position 
// public class InsertAtPosition {
  // public static void main(String[] args) {
    // int[] arr = {1, 2, 4};
    // int pos = 2, value = 3;
    // int[] newArr = new int[arr.length + 1];
    // for (int i = 0, j = 0; i < newArr.length; i++) {
      // if (i == pos)
        // newArr[i] = value;
      // else
        // newArr[i] = arr[j++];
    // }
    // for (int num : newArr) System.out.print(num + " ");
  // }
// }

// 8. Find minimum and maximum value in an array 
// public class MinMaxArray {
  // public static void main(String[] args) {
    // int[] arr = {2, 5, 1, 9};
    // int min = arr[0], max = arr[0];
    // for (int num : arr) {
      // if (num < min)
        // min = num;
      // if (num > max)
        // max = num;
    // }
    // System.out.println("Min: " + min + ", Max: " + max);
  // }
// }

// 9. Reverse an array
 // public class ReverseArray {
  // public static void main(String[] args) {
    // int[] arr = {1, 2, 3};
    // for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
  // }
// }

// 10. Find duplicate values in an array
 // import java.util.*;
// public class FindDuplicates {
  // public static void main(String[] args) {
    // int[] arr = {1, 2, 3, 2, 4, 1};
    // Set<Integer> seen = new HashSet<>();
    // Set<Integer> dup = new HashSet<>();
    // for (int num : arr) {
      // if (!seen.add(num))
        // dup.add(num);
    // }
    // System.out.println("Duplicates: " + dup);
  // }
// }

// 11. Find common values between two arrays
 // import java.util.*;
// public class CommonValues {
  // public static void main(String[] args) {
    // int[] arr1 = {1, 2, 3};
    // int[] arr2 = {2, 3, 4};
    // Set<Integer> set = new HashSet<>();
    // for (int num : arr1) set.add(num);
    // Set<Integer> common = new HashSet<>();
    // for (int num : arr2)
      // if (set.contains(num))
        // common.add(num);
    // System.out.println("Common: " + common);
  // }
// }

// 12. Remove duplicate elements from an array
 // import java.util.*;
// public class RemoveDuplicates {
  // public static void main(String[] args) {
    // int[] arr = {1, 2, 2, 3, 1};
    // Set<Integer> set = new LinkedHashSet<>();
    // for (int num : arr) set.add(num);
    // System.out.println("Unique: " + set);
  // }
// }

// 13. Find second largest number in an array
 // public class SecondLargest {
  // public static void main(String[] args) {
    // int[] arr = {3, 5, 2, 9, 7};
    // int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
    // for (int num : arr) {
      // if (num > first) {
        // second = first;
        // first = num;
      // } else if (num > second && num != first) {
        // second = num;
      // }
    // }
    // System.out.println("Second largest: " + second);
  // }
// }

// 15. Count even and odd numbers
 // public class CountEvenOdd {
  // public static void main(String[] args) {
    // int[] arr = {1, 2, 3, 4, 5};
    // int even = 0, odd = 0;
    // for (int num : arr) {
      // if (num % 2 == 0)
        // even++;
      // else
        // odd++;
    // }
    // System.out.println("Even: " + even + ", Odd: " + odd);
  // }
// }

// 16. Difference between largest and smallest
 // public class DiffMinMax {
  // public static void main(String[] args) {
    // int[] arr = {7, 1, 9};
    // int min = arr[0], max = arr[0];
    // for (int num : arr) {
      // if (num < min)
        // min = num;
      // if (num > max)
        // max = num;
    // }
    // System.out.println("Difference: " + (max - min));
  // }
// }

// 17. Check if array contains 12 and 23 
// public class Contains12And23 {
  // public static void main(String[] args) {
    // int[] arr = {5, 12, 23, 1};
    // boolean has12 = false, has23 = false;
    // for (int num : arr) {
      // if (num == 12)
        // has12 = true;
      // if (num == 23)
        // has23 = true;
    // }
    // System.out.println("Contains both: " + (has12 && has23));
  // }
// }

// 18. Remove duplicates and return new array
 // import java.util.*;
// public class RemoveAndReturn {
  // public static void main(String[] args) {
    // int[] arr = {1, 1, 2, 3};
    // Set<Integer> set = new LinkedHashSet<>();
    // for (int num : arr) set.add(num);
    // System.out.println("New array: " + set);
  // }
// }

// 19. Find missing number from sorted array 1 to 100
 // public class FindMissingNumber {
  // public static void main(String[] args) {
    // int[] arr = new int[99];
    // int missing = 57;
    // simulate missing number for (int i = 0, j = 1; j <= 100; j++) {
      // if (j != missing)
        // arr[i++] = j;
    // }
    // int expectedSum = 100 * 101 / 2;
    // int actualSum = 0;
    // for (int num : arr) actualSum += num;
    // System.out.println("Missing number: " + (expectedSum - actualSum));
  // }
// }