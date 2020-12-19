public class twoSum {
        public static int[] twoSum(int[] nums, int target) {
            int result;
            int[] sums = {0,0};
            int sumIndex1 = 0;
            int sumIndex2 = 1;
            while(true){
                if(sumIndex2 == nums.length - 1){
                    sumIndex1++;
                    sumIndex2 = 0;
                }else{
                    sumIndex2++;
                }
                if(sumIndex1 != sumIndex2) {
                    result = nums[sumIndex1] + nums[sumIndex2];
                    if(result == target) {
                        break;
                    }
                }
            }
            sums[0] = sumIndex1;
            sums[1] = sumIndex2;
            return sums;

        }
        public static void main(String[] args){
            int[] nums = {0,4,3,0};
            int target = 0;
            int[] solution = twoSum(nums, target);
            System.out.println("Number 1: "+solution[0]);
            System.out.println("Number 2: "+solution[1]);
        }
}
