/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 0;
        int last = n;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (isBadVersion(mid) == true && isBadVersion(mid - 1) == false)
                return mid;
            else if (!isBadVersion(mid)) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
}