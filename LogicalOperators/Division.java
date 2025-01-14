public class Division {
    public void division(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] % 4 == 0) {
                System.out.print(arr[i]+",");
            }
        }
    }


}