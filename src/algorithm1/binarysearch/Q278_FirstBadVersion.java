package algorithm1.binarysearch;

/**
 * [EASY]
 */
public class Q278_FirstBadVersion {
    public static class VersionControl{
        boolean isBadVersion(int version){
            return version >= 1702766719;
        }
    }
    public static class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            return search(1, n);
        }

        public int search(int start, int end){
            if(start > end) return -1;

            long midLong = start;
            midLong += end;

            int mid = (int) (midLong / 2);

            if(isBadVersion(mid)){
                int left = search(start, mid - 1);
                if(left > 0) return left;
                return mid;
            }else{
                return search(mid + 1, end);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.firstBadVersion(2126753390));
    }
}
