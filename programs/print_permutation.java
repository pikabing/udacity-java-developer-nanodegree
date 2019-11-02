class PrintPermutation {

    public static void printPermutn(int[] arr, int index) {
        
       int size = arr.length;

       if(index == size - 1)
        {
            for(int i = 0; i< size; i++)    
                System.out.print(arr[i]);
            System.out.println();
        } else {
           for(int i =index; i<arr.length; i++) {
                swap(arr, index, i);
                printPermutn(arr, index+1);
                swap(arr, index, i); 
           }
        }
    }
    public static void printPermutn(String suffix, String prefix) {
        int size = suffix.length();
        if(size == 0) {
            System.out.println(prefix);
        } else {
            for(int i=0; i < suffix.length(); i++) {
                printPermutn((suffix.substring(0, i) + suffix.substring(i+1)),
                                prefix + suffix.charAt(i));
            }
        }
    }
    
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // int[] arr = {1,2,3};
        // printPermutn(arr, 0);
        printPermutn("abc", "");
    }
}