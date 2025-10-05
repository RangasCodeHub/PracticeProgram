package strings;

public class StringReverse {
    public static void main(String[] args) {
        String s = "hello";
        String reverse = "";
        //Using for loop
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);
        //Using while loop
        String str = "mani";
        char[] a = str.toCharArray();
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        String rev = "";
        for (char c : a) {
            rev = rev + c;
        }
        System.out.println(rev);
    }
}
