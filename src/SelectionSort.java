public class SelectionSort {
    public static void main(String[] args) {
        int [] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        print(a);
    }
    static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                minPos = a[j] < a[minPos] ? j : minPos;
            }
            swap(a, i, minPos);
        }
    }

    static void swap(int [] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void print(int [] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
