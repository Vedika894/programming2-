public class Main {
    public static void main (String[] args){
        double[] nums = {1,2,3,4,5};
        boolean[] flags = {true, false, true};

        double result = calculateSum(nums, flags);
        System.out.println(result);

    }
    public static double calculateSum (double[] nums, boolean[] flags){
        double sum =0;
        //use the shortest length of the two arrays
        int len = Math.min(nums.length, flags.length);

        //loop through both arrays using the index
        for (int i = 0; i < len ; i++){
            if (flags[i]){   //only add num1 if flags[i] is true
                sum += nums[i];  //add the value from num[i] to the sum
            }
        }
        return sum;
    }
}