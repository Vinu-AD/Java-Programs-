package problemsolving.arrayproblems;

public class InversionsCount {
    static int inversionCount1(int[] arr) {
        // Code Here
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
        }
        return count;
    }

    static int countAndMerge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int res = 0;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[i + l];
        for (int j = 0; j < n2; j++)
            right[j] = arr[j + m + 1];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if(left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                res += n1 - i;
            }
        }
        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];

        return res;
    }

    static int countInv(int[] arr, int l, int r) {
        int res = 0;
        if (l < r) {
            int m = (l + r) / 2;
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            res += countAndMerge(arr, l, m, r);
        }
        return res;
    }

    static int inversionCount(int[] arr) {
        return countInv(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
//        int[] arr = {2, 4, 1, 3, 5}; // 3
//        int[] arr = {2, 3, 4, 5, 6}; // 0
        int[] arr = {5, 4, 3, 2}; // 6
//        System.out.println(inversionCount1(arr));
        System.out.println(inversionCount(arr));
    }
}
