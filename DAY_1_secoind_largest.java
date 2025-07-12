public class DAY_1_secoind_largest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 100, 99, 99, 78, 0};
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondlargest = largest;
                largest = num;
            } else if (num > secondlargest && num < largest) {
                secondlargest = num;
            }
        }

        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println(secondlargest);
        }
    }
}
