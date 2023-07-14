package happyFamily;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int  input = 3;

        int[] b = new int[a.length-1];
        int k=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==input)
                k++;
            else b[i-k]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
