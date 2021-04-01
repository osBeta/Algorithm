import org.jetbrains.annotations.NotNull;

public class ShellSort {
    public static void main(String[] args) {
        int [] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        print(a);
    }

    static void sort(int[] a) {

        int h = 1;
        while(h <= a.length / 3) {
            h = h * 3 + 1;
        }

        for(int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for(int i = gap; i < a.length; i++) {
                for(int j = i; j > gap - 1; j -= gap) {
                    if(a[j] < a[j - gap]) {
                        swap(a, j, j - gap);
                    }
                }
            }
        }
    }

    static void swap(int @NotNull [] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void print(int[] a) {
        for(int i : a)
            System.out.print(i + " ");
    }
}
