import java.util.ArrayList;
import java.util.*;

public class Recursion3Advanced {
    public static void main(String[] args) {
        String a = ("abc");
        int n = 4, m = 2;
        // Permut("abcd", "");
        // int s=countpath(0, 0, n, m);
        // int s = palcetile(n, m);
        // System.out.println(s);
        // int s=callguests(n);
        // System.out.println(s);
        ArrayList<Integer> subset = new ArrayList<>();
        // findsubsets(4,subset);
    }

    public static void Permut(String s, String Permutation) {
        if (s.length() == 0) {
            System.out.println(Permutation);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            String newstr = s.substring(0, i) + s.substring(i + 1);
            Permut(newstr, Permutation + currChar);
        }
    }

    // simple maze paths
    public static int countpath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // to move downwards
        int down = countpath(i + 1, j, n, m);
        // to right
        int right = countpath(i, j + 1, n, m);
        return down + right;
    }

    /// tile placemen of 1xm for n=4 and m=2
    public static int palcetile(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertical
        int vertplac = palcetile(n - m, m);
        /// horizzzz
        int horizplac = palcetile(n - 1, m);
        return vertplac + horizplac;
    }

    // / guets calllll
    public static int callguests(int n) {
        if (n <= 1) {
            return 1;
        }

        // single
        int ways1 = callguests(n - 1);
        // pairs
        int ways2 = (n - 1) * callguests(n - 2);
        return ways1 + ways2;
    }

    // subsets of n
    public static void findsubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printsubset(subset);
            return;
        }
        // add
        subset.add(n);
        findsubsets(n - 1, subset);
        //remove
        subset.remove(subset.size() - 1);
        findsubsets(n - 1, subset);
    }

    public static void printsubset(ArrayList<Integer> subset) {
        for (int i = -0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
}
