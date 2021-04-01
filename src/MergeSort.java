public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 3, 6, 9};
        sort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void sort(int[] arr, int left, int right) {
        if (left == right) return;
        int mid = left + (right - left)/2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid + 1, right);
    }

    static void merge(int[] arr, int leftPtr, int rightPtr, int rightBound) {
        int mid = rightPtr - 1;
        int[] temp = new int[rightBound - leftPtr + 1];

        int i = leftPtr;
        int j = rightPtr;
        int k = 0;

        while(i <= mid && j <= rightBound) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] :arr[j++];
        }

        while(i <= mid) temp[k++] = arr[i++];
        while(j <= rightBound) temp[k++] = arr[j++];

        if (temp.length >= 0) System.arraycopy(temp, 0, arr, leftPtr, temp.length);
    }

    static void print(int[] arr) {
        for(int j : arr)
            System.out.print(j + " ");
    }
}
