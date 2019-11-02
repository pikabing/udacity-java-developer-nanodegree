class TwoSum {

    public static boolean twoSum(int[] nums, int target) {
        boolean isSum = false;
        for(int i = 0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(i != j) {
                    int sum = nums[i] + nums[j];
                    if(sum == target){
                        isSum = true;
                        break;
                    }
                }
                if(isSum)
                    break;
            }
            if(isSum)
                break;
        }

        return isSum;
    }
        
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(twoSum(arr, 10));
        
    }
}