public class NextHigherCheck {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 7, 10, 9};

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n\nChecking if next element is higher:");

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                System.out.println(arr[i + 1] + " is higher than " + arr[i]);
            } else {
                System.out.println(arr[i + 1] + " is NOT higher than " + arr[i]);
            }
        }
    }
}
