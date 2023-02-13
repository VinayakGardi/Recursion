import java.util.ArrayList;

public class arrayrecursion {
    public static void main(String[] args) {
        int nums[] ={1,2,31,4,5,6};
//        System.out.println(sorted(nums,0));
//        System.out.println(linear(nums,6353,0));
//        System.out.println(linearIndex(nums,36362 ,0));
        ArrayList<Integer> list = new ArrayList<>();
        int arr[]= {23,15,63,63,63};
//        System.out.println(Find(arr,366,0,list));
        System.out.println(FindAllIndexes(arr,63,0));
    }

    static boolean sorted(int nums[],int i) {
        if(i== nums.length-1){
            return true;                       // check if array is sorted
        }
        return nums[i]<nums[i+1] && sorted(nums,i+1);
    }

    static boolean linear(int nums[],int target, int i) {
        if(i== nums.length ) {
            return false;                                   // linear search returning boolean value
        }
        return  nums[i]==target || linear(nums,target,i+1);
    }

    static int linearIndex(int nums[],int target ,int i) {
        if(i == nums.length) {
            return -1;                                     // linear search returning index
        }
        if(nums[i]== target) {
            return i;
        }
        return linearIndex(nums,target,i+1);
    }


    static ArrayList Find(int nums[],int target,int i,ArrayList<Integer> list) {
        if(i == nums.length) {
            return list;                                // return arraylist with multiple indexes if present
        }
        if(nums[i] == target) {
            list.add(i);
        }
        return Find(nums,target,i+1,list);
    }

    static ArrayList FindAllIndexes(int nums[],int target,int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if(i == nums.length) {
            return list;
        }

        if(nums[i]== target) {
            list.add(i);
        }
        ArrayList listfrombelow = FindAllIndexes(nums,target,i+1);
        if(listfrombelow.isEmpty()) {

        }
        else {
            list.addAll(listfrombelow);
        }
        return list;
    }
}
