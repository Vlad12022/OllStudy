package HomeWork;

public class MainEx2 {
    public static void main(String[] args) {

        int[] arr = {2, 0, 1, 5, 3, 4, 6, 7, 9, 8};


        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr[i]; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
