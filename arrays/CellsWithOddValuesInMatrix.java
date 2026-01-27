void main() {
    int ans = oddCells(2, 3, new int[][]{{0,1},{1,1}});
    System.out.println(ans);
}

public int oddCells(int m, int n, int[][] indices) {
    int[] row = new int[m];
    int[] col = new int[n];

    for (int[] index : indices) {
        row[index[0]]++;
        col[index[1]]++;
    }
    int oddRows = 0;
    int oddCols = 0;

    for (int r : row) {
        if (r%2 == 1) {
            oddRows++;
        }
    }
    for (int c : col) {
        if (c%2 == 1) {
            oddCols++;
        }
    }
    
    return oddRows * (n - oddCols) + (m - oddRows) * oddCols;
}