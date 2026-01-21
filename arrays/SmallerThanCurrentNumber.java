void main() {
    int[] arr = {6,5,4,8};
    int[] ans = smallerNumbersThanCurrent2(arr);
    System.out.println(Arrays.toString(ans));
}

public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] ans = new int[nums.length];
    for (int i = 0; i < ans.length; i++) {
        int count = 0;
        for (int j = 0; j < ans.length; j++) {
            if (i != j && nums[i] > nums[j]) {
                count++;
            }
            ans[i]=count;
        }
    }

    return ans;
}

// Using frequency array -> Better performance
public int[] smallerNumbersThanCurrent2(int[] nums) {
    int[] freqArr = new int[101];
    for (int i = 0; i < nums.length; i++) {
        freqArr[nums[i]]++;
    }

    int[] ans = new int[nums.length];
    for (int i = 1; i < 101; i++) {
        freqArr[i] += freqArr[i-1];
    }

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            ans[i] = 0;
        } else {
            ans[i] = freqArr[nums[i]-1];
        }
    }

    return ans;
}