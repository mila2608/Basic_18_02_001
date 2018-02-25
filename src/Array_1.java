import java.util.Arrays;

public class Array_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(" time 12:00 h".trim().split("\\s+")));
        System.out.println((" time 12:00 h".trim().split("\\s+")[1]));
        int x;
        double y;
        String str = "675657";
        System.out.println(x = Integer.parseInt(str));
        System.out.println(y = Double.parseDouble(str));
        System.out.println(str = String.valueOf(x + 1));
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        revert(a1);
        System.out.println(Arrays.toString(a1));

        int[] n = {3, 5, 1, 6, 7, 4, 9, 3, 2, 8, 9, 1, 2};
int[] a2 = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        sort(n);
        System.out.println(Arrays.toString(n));
        int pos = Arrays.binarySearch(a1, 10);
        System.out.println(pos);
        System.arraycopy(a1,3, a2, 4,7);
        System.out.println(Arrays.toString(a2));
    }

    private static void sort(int[] n) {
        for (int i = n.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int temp;
                if (n[j] > n[j + 1]) {
                    temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
    }

    private static void revert(int[] a1) {

        for (int i = 0; i < a1.length; i++) {
            int tmp;
            tmp = a1[i];
            a1[a1.length - 1 - i] = tmp;
        }

        System.out.println();
    }
}
