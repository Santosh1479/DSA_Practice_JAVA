public class MergeSort {
    public static void conquer(int p[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (p[idx1] <= p[idx2]) {
                merged[x] = p[idx1];
                x++;
                idx1++;
            } else {
                merged[x++] = p[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = p[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = p[idx2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            p[j] = merged[i];

        }
    }

    public static void divide(int p[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(p, si, mid);
        divide(p, mid + 1, ei);
        conquer(p, si, mid, ei);

    }

    public static void main(String[] args) {
        int s[] = { 6, 3, 9, 5, 2, 8 };
        int l = s.length;
        divide(s, 0, l - 1);
        // to print
        for (int i = 0; i < l; i++) {
            System.out.println(s[i] + " ");
        }
        System.out.println();

    }

}
