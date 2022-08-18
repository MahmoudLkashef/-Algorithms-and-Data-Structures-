class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []result=new int[2];
        result[0]=startingIndex(nums,target);
        result[1]=endingIndex(nums,target);
        return result;
        
    }
    public int startingIndex(int []nums,int target)
    {
        int begin=0,end=nums.length-1,index=-1;
        while(begin<=end)
        {
            int mid=begin+(end-begin)/2;
            if(nums[mid]==target)
            {
                index=mid;
                end=mid-1;
            }
            else if(nums[mid]<target)begin=mid+1;
            else end=mid-1;
        }
        return index;
    }
    public int endingIndex(int []nums,int target)
    {
        int begin=0,end=nums.length-1,index=-1;
        while(begin<=end)
        {
            int mid=begin+(end-begin)/2;
            if(nums[mid]==target)
            {
                index=mid;
                begin=mid+1;
            }
            else if(nums[mid]<target)begin=mid+1;
            else end=mid-1;
        }
        return index;
    }
}

/*
Time comlexity : O(log n)
Space complexity : O(1)

problem : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
*/