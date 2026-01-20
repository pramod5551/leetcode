import java.util.Arrays;

void main() {
    int[] arr = {1,3,2,1};
    int[] ans = getConcatenation(arr);

    System.out.println(Arrays.toString(ans));
}

public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n * 2];
    for (int i=0; i < nums.length; i++) {
        ans[i] = nums[i];
    }
    for (int i=0; i < n; i++) {
        ans[n + i] = nums[i];
    }

    return ans;
}