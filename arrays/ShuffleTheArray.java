void main() {
    int[] arr = {1,2,3,4,4,3,2,1};
    int[] ans = shuffle(arr, 4);
    System.out.println(Arrays.toString(ans));
}

public int[] shuffle(int[] nums, int n) {
    int[] ans = new int[nums.length];
    for (int i=0,j=n ; i < n && j < nums.length; i++,j++) {
        ans[2*i] = nums[i];
        ans[2*i+1] = nums[j];
    }
    return ans;
}