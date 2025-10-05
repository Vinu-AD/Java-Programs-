package problemsolving.arrayproblems;

public class KthElementOfTwoArrays {
    public static int kthElement(int[] a, int[] b, int k) {
        // code here
        int a_ind = 0;
        int b_ind = 0;
        int res = -1;
        for(int i = 0; i < k; i++) {
            if (a_ind < a.length) {
                if (b_ind < b.length && a[a_ind] > b[b_ind]) res = b[b_ind++];
                else res = a[a_ind++];
            }
            else if (b_ind < b.length){
                res = b[b_ind++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {8, 10, 10, 11, 12, 13, 13, 13};
        int[] b = {5, 6, 8, 10, 13};
        System.out.println(kthElement(a, b, 8));
    }
}
