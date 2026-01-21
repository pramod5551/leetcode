import java.util.ArrayList;

void main() {
    int[] candies = {4,2,1,1,2};
    List<Boolean> ans = kidsWithCandies(candies, 1);
    System.out.println(ans);
}

public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> ans = new ArrayList<>(candies.length);
    int max = max(candies);
    
    for (int i : candies) {
        ans.add(i+extraCandies > max);
    }
    return ans;
}

public int max(int[] candies) {
    int max = 0;
    for (int i : candies) {
        if (i > max) {
            max = i;
        }
    }
    return max;
}