public class binarysearch {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5,6,7};
        int target =3;
        int start =0,end= nums.length-1;
     binary(start,end,nums,target);
    }

    public static void binary(int start ,int end , int nums[],int target) {
           if(start <= end) {
               int mid = start +(end-start)/2;

               if(nums[mid] == target) {
                   System.out.println(mid + " -> position ");
                   System.out.println(nums[mid]+" -> target");
               }
               else if(nums[mid] > target) {
                   end = mid -1;
                   binary(start ,end, nums,target);
               }
               else {
                   start = mid+1;
                   binary(start,end,nums,target);
               }

           }

    }
}
