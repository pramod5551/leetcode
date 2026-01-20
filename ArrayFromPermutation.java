import java.util.Arrays;

void main() {
    int[] nums = {0,2,1,5,3,4};
    int[] ans = buildArray(nums);

    System.out.println(Arrays.toString(ans));
}

public int[] buildArray(int[] nums) {
    int size = nums.length;
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = nums[nums[i]];
    }

    return arr;
}
