class demo
{
    public static void main(String[] args) {
            int nums[]={1,7,9,2,5};

            int lower=11;
            int upper=11;
        System.out.println(count(nums,lower,upper));
    }

    static long count(int nums[],int lower,int upper) {
        long count=0;
        for(int i=0;i< nums.length;i++) {
            for (int j=0;j<nums.length;j++) {
                if(0<=i && i<j && lower<= nums[i]+nums[j]  && upper>=nums[i]+nums[j])
                {

                        count++;

                }

            }
        }
        return count;

    }
}