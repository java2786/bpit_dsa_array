import java.util.Arrays;

class TransposeMatrix{
    // public int[][] transpose(int[][] matrix) {
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=1;j<matrix[i].length;j++){
    //             int temp = matrix[i][j];
    //             matrix[i][j] = matrix[j][i];
    //             matrix[j][i] = temp;
    //         }
    //     }
    //     return matrix;
    // }

    public int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }
}
public class Demo_4 {
    public static void main(String[] args) {
        TransposeMatrix tm = new TransposeMatrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // Output: [[1,4,7],[2,5,8],[3,6,9]]
        System.out.println(Arrays.deepToString(tm.transpose(matrix)));

    }
}
