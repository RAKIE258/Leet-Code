//1470. Shuffle the Array

class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[nums.length];
        int s=0,e=n;
        for(int i=0; i<nums.length;i++)
        {
            if(i%2==0)
                res[i]=nums[s++];
            else
                res[i]=nums[e++];
        }
        return res;
    }
}