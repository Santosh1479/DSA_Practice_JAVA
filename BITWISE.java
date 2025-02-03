public class BITWISE {
    public static void main(String[] args) {

        // get bit
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("0 bit");
        } else {
            System.out.println("1 bit");
        }
        // set bit
        n = 5;
        pos = 1;
        bitMask = 1 << pos;
        int newnum = bitMask | n;
        System.out.println(newnum);
        // clear bit
        n = 5;
        pos = 2;
        bitMask = 1 << pos;
        int hey = (~(bitMask) & n);
        System.out.println(hey);
        // update bit to make 1
        n = 5;
        pos = 1;
        bitMask = 1 << pos;
        hey = (bitMask | n);
        System.out.println(hey);
        // to make 0
        n = 5;
        pos = 2;
        bitMask = 1 << pos;
        hey = (~(bitMask) & n);
        System.out.println(hey);
    }
}
