class CountNegativeNumbersInSortedMatrix{
    // public int countNegatives(int[][] grid) {
    //     int count = 0;
    //     for(int[] row: grid){
    //         for(int val: row){
    //             if(val<0){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] row: grid){
            int low = 0;
            int high = row.length-1;
            while(low<=high){
                int mid = (low + high)/2;
                if(row[mid]<0){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            count += (row.length - low);
        }
        return count;
    }
}
public class Demo_6 {
    public static void main(String[] args) {
        CountNegativeNumbersInSortedMatrix obj = new CountNegativeNumbersInSortedMatrix();

        int res = obj.countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}});

        System.out.println(res);//8
    }    
}
