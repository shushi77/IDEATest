/**
 * @author Administrator
 * @date 2021/1/11 11:57
 */
public class HelloWorld {
    public static void main(String[] args) {
        int arr []  ={2,3,5,9,6,7,8,4};
        for (int i =0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}