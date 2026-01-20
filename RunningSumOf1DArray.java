import java.util.Arrays;

void main() {
    int[] arr = {3,1,2,10,1};
    int[] ans = runningSum(arr);

    System.out.println(Arrays.toString(ans));
}

public int[] runningSum(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
        nums[i] += nums[i-1];
    }
    return nums;
}