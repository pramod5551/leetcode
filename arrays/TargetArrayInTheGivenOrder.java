import java.util.List;

void main() {
    int[] nums = {0,1,2,3,4};
    int[] index = {0,1,2,2,1};

    int[] ans = createTargetArray2(nums, index);
    System.out.println(Arrays.toString(ans));
}

public int[] createTargetArray(int[] nums, int[] index) {
    int[] target = new int[nums.length];
    
    for (int i = 0; i < nums.length; i++) {
        for (int j = target.length-1; j > index[i]; j--) {
            target[j] = target[j-1];
        }
        target[index[i]] = nums[i];
    }
    return target;
}
// Optimized version using ArrayList
public int[] createTargetArray2(int[] nums, int[] index) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        list.add(index[i], nums[i]);
    }
    for (int i = 0; i < nums.length; i++) {
        nums[i] = list.get(i);
    }

    return nums;
}