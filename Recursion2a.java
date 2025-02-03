import java.util.HashSet;

public class Recursion2a {
    public static int first = -1;
    public static int Last = -1;

    public static boolean[] map = new boolean[26];

    public static void main(String[] args) {
        int n = 4;
        // towerOfhanoi(n, "s", "h", "d");
        // String a=("xxxxxxsxaxnxtxxaxxxxx");
        String a = ("1234");
        // Reverse(a,a.length()-1);
        HashSet<String> set = new HashSet<>();
        // AlphaTrack(a, 0, 'a');
        // RemDup(a, 0, "");
        // subsequences(a, 0, "");
        // Unqsubsequences(a, 0, "",set);
        // PrintCombo(a, 0, "");
        pricom(a, 0, "");
        // int a[] = { 1, 3, 4, 7, 5 };
        // System.out.println(incSort(a, 0));
        // System.out.println(duplast(a, 0, 'x', 0, ""));
        // System.out.println(remdup(a, 0, ""));
        // subs(a, 0, "");
        // uniqsubs(a, 0, "", set);
    }
    // TOWER OF HANOIIIIIII+++++++++++++++
    // public static void towerOfhanoi(int n,String source,String helper,String
    // destination) {
    // if(n==1){
    // System.out.println("transfer disk "+ n+" from " + source+ "to "
    // +destination);
    // return ;

    // }

    // towerOfhanoi(n-1, source, destination, helper);
    // System.out.println("transfer disk "+ n+" from " + source+ "to "
    // +destination);
    // towerOfhanoi(n-1, helper, source, destination);

    // }

    // STRING ERVERSE++++++++++++
    // public static void Reverse(String p,int a) {
    // if(a==0){
    // System.out.print(p.charAt(a));
    // return ;
    // }
    // System.out.print(p.charAt(a));
    // Reverse(p, a-1);
    // }

    // first and last OCCURANCE in string+++++

    public static void AlphaTrack(String a, int q, Character ToTrack) {
        if (q == a.length()) {
            System.out.println(first);
            System.out.println(Last);
            return;
        }
        char currChar = a.charAt(q);
        if (currChar == ToTrack) {
            if (first == -1) {
                first = q;
            } else {
                Last = q;
            }
        }
        AlphaTrack(a, q + 1, ToTrack);
    }

    // Strictly increasing sorted array
    public static boolean incSort(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return incSort(arr, idx + 1);
    }

    public static String duplast(String s, int idx, char a, int count, String newString) {
        if (idx == s.length()) {
            for (int i = 0; i < count; i++) {
                newString += a;
            }
            return newString;
        }
        if (s.charAt(idx) == a) {
            count += 1;
            return duplast(s, idx + 1, a, count, newString);
        } else {
            newString += s.charAt(idx);
            return duplast(s, idx + 1, a, count, newString);
        }

    }

    //// duplicate removal in string
    public static String remdup(String s, int idx, String newString) {
        if (idx == s.length()) {
            return newString;
        }
        char currchar = s.charAt(idx);
        if (map[currchar - 'a']) {
            return remdup(s, idx + 1, newString);
        } else {
            newString += currchar;
            map[currchar - 'a'] = true;
            return remdup(s, idx + 1, newString);
        }
    }
    // public static void remdup(String s,int idx, String newString){
    // if(idx==s.length()){
    // System.out.println(newString);
    // return;
    // }
    // char currchar = s.charAt(idx);
    // if(map[currchar-'a']){
    // remdup(s, idx+1,newString);
    // }else{
    // newString+=currchar;
    // map[currchar-'a']=true;
    // remdup(s, idx+1, newString);
    // }
    // }

    public static void subs(String s, int idx, String newString) {
        if (idx == s.length()) {
            System.out.println(newString);
            return;
        }
        char currchar = s.charAt(idx);
        subs(s, idx + 1, newString + currchar);

        subs(s, idx + 1, newString);
    }
    ///// subsequences of a stringgggg+++++++++++++

    public static void subsequences(String a, int idx, String newString) {
        if (idx == a.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = a.charAt(idx);
        // to join
        subsequences(a, idx + 1, newString + currChar);
        // dont join string
        subsequences(a, idx + 1, newString);
    }

    // / unique subsequents
    public static void Unqsubsequences(String a, int idx, String newString, HashSet<String> set) {
        if (idx == a.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = a.charAt(idx);
        // to join
        Unqsubsequences(a, idx + 1, newString + currChar, set);
        // dont join string
        Unqsubsequences(a, idx + 1, newString, set);
    }

    public static void uniqsubs(String s, int idx, String newString, HashSet<String> set) {
        if (idx == s.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = s.charAt(idx);
        // to join
        uniqsubs(s, idx + 1, newString + currChar, set);
        // dont join string
        uniqsubs(s, idx + 1, newString, set);
    }

    //// mobile keypad
    public static String[] Keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vw", "xyz", };

    public static void pricom(String s, int idx, String combo) {
        if (idx == s.length()) {
            System.out.println(combo);
            return;
        }
        char currChar = s.charAt(idx);
        String mapping = Keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            pricom(s, idx + 1, combo + mapping.charAt(i));

        }

    }
    // public static void PrintCombo(String g, int idx, String combination) {
    // if (idx == g.length()) {
    // System.out.println(combination);
    // return;
    // }
    // char currChar = g.charAt(idx);
    // String mapping = Keypad[currChar - '0'];

    // for (int i = 0; i < mapping.length(); i++) {
    // PrintCombo(g, idx + 1, combination + mapping.charAt(i));
    // }
    // }

}
