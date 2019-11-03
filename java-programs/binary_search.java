class BinarySearch {

    static int binarySearch(int[] array, int target) {

        if(array.length == 0)
            return -1;

        int start = 0;
        int last = array.length - 1;
        int mid = last/2;

        while(mid >= 0 && mid < array.length) {

            if(array[mid] > target) {
                last = mid - 1;
            } else if (array[mid] < target) {
                start = mid+1;
            } else if(array[mid] == target) {
                return mid + 1;
            }

            mid = (start + last) / 2;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
        int target = 25;
        System.out.println(binarySearch(array, target));
    }
}