class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int nums2[]=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
          for(int j=0;j<nums.length;j++)
          {
              if(nums[i]>nums[j])
              {
                  s=s+1;
              }
          }
          nums2[i]=s;
          s=0;
        }
        return nums2;
    }
}
