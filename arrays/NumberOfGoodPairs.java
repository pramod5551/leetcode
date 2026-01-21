void main() {
    int[] nums = {1,1,1,1};
    int pairs = numIdenticalPairs2(nums);
    System.out.println(pairs);
}

public int numIdenticalPairs(int[] nums) {
    int pairs = 0;
    for (int i = 0; i < nums.length; i++) {
        for (int j = i+1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                pairs++;
            }
        }
    }
    return pairs;
}

//  using frequency array
public int numIdenticalPairs2(int[] nums) {
    // Frequency array for numbers 1 to 100
    int[] frequency = new int[101];

    // Count occurrences
    for (int num : nums) {
        frequency[num]++;
    }

    // Variable to store total number of good pairs
    int pairs = 0;

    // Calculate pairs using combination formula
    for (int i = 0; i < frequency.length; i++) {
        if (frequency[i] > 1) {
            pairs += frequency[i] * (frequency[i] - 1) / 2;
        }
    }

    return pairs;
}