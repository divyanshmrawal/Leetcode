//QUESTION->
//Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

// To flip an image horizontally means that each row of the image is reversed.

// For example, flipping [1,1,0] horizontally results in [0,1,1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

// For example, inverting [0,1,1] results in [1,0,0].

//ANSWER-->
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            for(int i=0;i<(image[0].length+1)/2;i++){
            int temp=row[i]^1;
            row[i]=row[image[0].length-i-1]^1;
            row[image[0].length-i-1]=temp;
            }
        }
        return image;
    }
}
