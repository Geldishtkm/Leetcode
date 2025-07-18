class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;
        
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    private int findPeak(MountainArray mountainArr) {
        int start = 0, end = mountainArr.length() - 1;
        
        while (start < end) {
            int mid = (start + end) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        
        return start;
    }

    private int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean increasing) {
        while (start <= end) {
            int mid = (start + end) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal == target) return mid;

            if (increasing) {
                if (midVal < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (midVal > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}