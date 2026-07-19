class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while (r >= l) {             // both l and r goes to min index
            int m = (l + r) / 2;
            if (nums[m] == target)
                return true;


            if (nums[m] == nums[l] && nums[m] == nums[r]) {        //FIXING WHERE IF L M AND R ARE SAME
                r -= 1;     
                l += 1;
                continue;
            }



            if (nums[l] > nums[m]) {            // right side sorted
                if (target >= nums[m] && target <= nums[r])
                    l = m + 1;
                else
                    r = m - 1;
            }
            else {
                if (target >= nums[l] && target <= nums[m])
                    r = m - 1;
                else
                    l = m + 1;
            }
        }
        return false;
    }
}