
public class Search2DMatirx2 {
	
    public static int searchMatrix(int[][] nums, int target) {
        // write your code here
    	// empty matrix
    	if (nums.length == 0)
    		return 0;
    	
    	int num_rows = nums.length;
    	int num_col = nums[0].length;
    	// target not in the range
    	if (target < nums[0][0] || target > nums[num_rows -1][num_col - 1])
    		return 0;
    	
    	// search from left-bottom to right-top
    	int i = num_rows -1; // row
    	int j = 0; // col
    	
    	int count = 0;
    	while (i >= 0 && j <= (num_col - 1)) {
    		
    		if (nums[i][j] ==  target) {
    			i--;
    			j++;
    			count++;
    			continue;
    		}else if (nums[i][j] <  target) {
    			j++;
    			continue;
    		}else if(nums[i][j] >  target) {
    			i--;
    			continue;
    		}
    		continue;
    	}
    	
    	
    	return count;
    }
}
