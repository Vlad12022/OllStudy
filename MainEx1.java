public class MainEx1 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 46;
        arr[1] = 26;
        arr[2] = 28;
        arr[3] = 71;
        arr[4] = 42;

        int max = arr[4];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число:" + max);

        String res = " ";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                res = res + arr[i] + ",";
            }
        }
        System.out.println("Четные числа:" + res.substring(0, res.length() - 1));

        int min = arr[4];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное число:" + min);

         String res1 = " ";

         for(int i = 0; i < arr.length; i++){
             if(arr[i] % 2 != 0){
                 res1 = res1 + arr[i] + ",";
             }
         }
        System.out.println("Не четные числа:" + res1.substring(0,res1.length() -1));







    }
}



