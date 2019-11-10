import java.util.Arrays;

public class LeeCode {

    /**
     * 在排序数组中查找元素的第一个和最后一个位置
     * 使用二分查找进行查找可以使复杂度达到O(logN)
     * @param nums 有序数组
     * @param target 目标值
     * @return 数组中保存的起始位置和终点位置
     */
    private int[] searchRange(int[] nums, int target) {
        if(nums.length ==1){
            if(nums[0] == target){
                return new int[]{0,0};
            }
        }
        return midsearch(nums,0,nums.length-1,target);
    }

    private int[] midsearch(int[] nums, int i, int length,int target) {
        if(i>length){
            return new int[]{-1,-1};
        }
        while(i<=length){
            int mid = (i + length)/2;
            if(nums[mid]>target){
                return midsearch(nums,i,mid-1,target);
            }else if(nums[mid] <target){
                return midsearch(nums,mid+1,length,target);
            }
            else{
                while(0<=mid && nums[mid]==target){
                    mid--;
                }
                int b = mid+1;
                while(mid<length&&nums[mid+1] ==target){
                    mid++;
                }
                int e = mid;
                return new int[]{b,e};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int nums[]={2,2};
        LeeCode l = new LeeCode();
        System.out.println(Arrays.toString(l.searchRange(nums, 2)));

    }
}
