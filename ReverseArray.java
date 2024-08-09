public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        System.out.println("Printing Array Elements: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        int start = 0;
        int temp = 0;
        int end = arr.length-1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversing Array Elements: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
