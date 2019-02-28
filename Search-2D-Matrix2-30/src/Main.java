
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums1 = {
				{3,4}				
		};
		int target1 = 3;

		int[][] nums2 = {
				{1, 3, 5, 7},
				{2, 4, 7, 8},
				{3, 5, 9, 10}			
		};
		int target2 = 3;


		int ans1 = Search2DMatirx2.searchMatrix(nums1, target1);
		int ans2 = Search2DMatirx2.searchMatrix(nums2, target2);

		System.out.println("ans1 = " + ans1 + "vVS 1");
		System.out.println("ans2 = " + ans2 + "vVS 2");
	}

}
