public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        int low = 0;
        int high = arr.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;

            if (arr[middle] == numberToFind)
            {
                System.out.println(middle);
                return;
            }
            else if (arr[middle] < numberToFind)
            {
                low = middle + 1;
            }
            else if (arr[middle] > numberToFind)
            {
                high = middle - 1;
            }
        }
        System.out.println(-1);
        return;
    }
}