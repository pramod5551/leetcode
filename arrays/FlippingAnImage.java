void main() {
    int[][] image =  {{1,1,0},{1,0,1},{0,0,0}};
    int[][] ans = flipAndInvertImage(image);
    System.out.println(Arrays.deepToString(ans));

}

public int[][] flipAndInvertImage(int[][] image) {
    
    for (int i = 0; i < image.length; i++) {
        int left = 0;
        int right = image[i].length-1;

        while (left < right) {
            int temp = image[i][left];
            image[i][left] = image[i][right];
            image[i][right] = temp;

            image[i][left] ^= 1;
            image[i][right] ^= 1;

            left++;
            right--;
        }
        if (right == left) {
            image[i][right] ^= 1;
        }
    }

    return image;
}