package string;

public class StringCompression {

    public int compress(char[] chars) {
        int len = chars.length;
        int res = 0;
        for(int i = 0; i < len;) {
            int j = i+1;
            while(j < len && chars[i] == chars[j]) {
                j++;
            }
            chars[res++] = chars[i];
            int count = j - i;
            if(count > 1) {
                for(char c : (""+count).toCharArray()) {
                    chars[res++] = c;
                }
            }
            i = j;
        }
        return res;
    }
    public static void main(String[] args) {
        char[] arr = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        StringCompression ob = new StringCompression();
        int newLength = ob.compress(arr);

        System.out.print(newLength + "=> ");
        for(int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
