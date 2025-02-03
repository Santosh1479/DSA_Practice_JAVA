public class Sorting {

    public static void pront(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        return;

    }

    public static void main(String[] args) {

        // bubleeeeeeeeee sortt
        // int a[] = { 1, 4, 7, 3, 5 };
        // // time complexity = 0{n^2};

        // for (int i = 0; i < a.length - 1; i++) {
        // for (int j = 0; j < a.length - i - 1; j++) {

        // if (a[j] > a[j + 1]) {
        // int temp = a[j + 1];
        // a[j + 1] = a[j];
        // a[j] = temp;
        // }
        // }
        // }
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i]+",");

        // }

        // time complexity = 0(n^2)
        // selection sort

        // int a[] = { 1, 4, 7, 3, 5 };

        // for (int i = 0; i < a.length - 1; i++) {
        // int smallest = i;
        // for (int j = i + 1; j < a.length; j++) {
        // if (a[smallest] > a[j]) {
        // smallest = j;
        // }

        // }
        // int temp = a[smallest];
        // a[smallest] = a[i];
        // a[i] = temp;
        // }
        // for (int i = 0; i < a.length; i++) {
        // System.out.println(a[i]);

        // }

        // insertion sort

        int a[] = { 7, 5, 3, 9, 1 };

        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && current < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
 
            // placement
            a[j+1] = current;

        }
        pront(a);
    }

}
