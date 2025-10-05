package problemsolving.arrayproblems.twodarray;

public class SearchAMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int n = matrix[0].length;
        int leftOuter = 0;
        int rightOuter = row - 1;

        while (leftOuter <= rightOuter) {
            int midRow = (rightOuter - leftOuter) / 2 + leftOuter;
            if (matrix[midRow][0] <= target && matrix[midRow][n-1] >= target){
                int left = 0;
                int right = n - 1;
                while (left <= right) {
                    int mid = (right - left) / 2 + left;
                    if (matrix[midRow][mid] == target)
                        return true;
                    else if (matrix[midRow][mid] < target)
                        left = mid + 1;
                    else if (matrix[midRow][mid] > target)
                        right = mid - 1;
                }
                return false;
            }
            else if (matrix[midRow][n - 1] < target)
                leftOuter = midRow + 1;
            else if (matrix[midRow][0] > target)
                rightOuter = midRow - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 50;
        System.out.println(searchMatrix(matrix, target));
    }
}
