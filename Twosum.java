package simpleprogram;

public class Twosum {
	public static int[] twoSum(int[] nums, int target) {
		int[] ans =new int[2];
		int n=nums.length;
        for (int i = 0; i <n; i++) {
            for (int j = i + 1; j <n; j++) {
                if (nums[j]+ nums[i]==target) {
                    ans[0]=i;
                    ans[1]=j;
                    break;
            }
        }
        }
        return ans;
    
    }
	public static void main(String[]args) {
		int[] nums=(int[]) new int[] {2,7,11,15};;
		int target=9;
		System.out.println(twoSum(nums,target));
	}
}

