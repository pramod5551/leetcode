void main() {
    int[] gain = {-5,1,5,0,-7};
    int ans = largestAltitude(gain);
    System.out.println(ans);
}

public int largestAltitude(int[] gain) {
    int[] ans = new int[gain.length + 1];
    ans[0] = 0;
    int max = 0;

    for (int i = 0; i < gain.length; i++) {
        ans[i+1] = ans[i] + gain[i];
        if (ans[i+1] > max) {
            max = ans[i+1];
        }
    }
    return max;
}