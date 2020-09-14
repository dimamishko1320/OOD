public class RadixSort  implements Isort {





    @Override
    public void sort(int[] arr) {
        int digitPlace = 1;
        int n=arr.length;
        int result[]=new int[n];

        int largestNum = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > largestNum)
                largestNum = arr[i];
        }
        int count[]=new int[10];
        while(largestNum/digitPlace >0) {

            for (int i = 0; i < 10; i++){
                count[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                int tmpIndex = Math.abs((arr[i] / digitPlace) % 10);
                count[tmpIndex]++;
            }
            for (int i = 1; i < 10; i++){
                count[i] += count[i - 1];
            }
            for (int i = n - 1; i >= 0; i--) {
                int tmpIndex = Math.abs((arr[i] / digitPlace) % 10);
                result[count[tmpIndex] - 1] = arr[i];
                count[tmpIndex]--;
            }
            for (int i = 0; i < n; i++){
                arr[i] = result[i];
            }
            digitPlace *= 10;
        }
    }
}
