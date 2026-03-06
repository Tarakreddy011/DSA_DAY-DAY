# My Notes For DSA Practice

## Arrays
An array is a data structure that stores a collection of elements, typically of the same type, in contiguous memory locations.

**Key Characteristics:**
* **0-Indexed:** The first element is at index `0`.
* **Fast Access:** Retrieving an element by its index takes O(1) time.
* **Contiguous Memory:** Elements sit side-by-side in memory, optimizing cache performance.
* **Fixed Size:** Traditional arrays are initialized with a strict, unchanging length.

### Creating an Array (Java)
```java
Scanner sc = new Scanner(System.in);
int len = sc.nextInt();
sc.nextLine(); // Consume the leftover newline

String[] name = new String[len];

for(int i = 0; i < name.length; i++) {
    System.out.println("Enter the value:");
    name[i] = sc.nextLine();
}
import java.util.Arrays;

// ... inside your method ...
int[] numbers = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
Arrays.sort(numbers);

// The array is now: {1, 6, 8, 12, 32, 39, 42, 44, 45, 69, 85, 89}
****
public int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i; // Match found, return the index
        }
    }
    return -1; // Loop finished without a match, return -1
}
