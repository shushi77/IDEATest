/**
 * @author Administrator
 * @date 2021/1/11 14:05
 */
public class Test01 {
    public  static void main(String[] args){
        int arr [] = {13,18,24,35,47,50,62,83,90,115,134};
        int start = 0;
        int end = 10;
        int mid =(start+end)/2;
        if (arr[mid]<90){
            start=mid;
            mid =(start+end)/2;
            if (arr[mid]<90){
                start=mid;
                mid =(start+end)/2;
            }
        }
    //我在github里修改了这个class
    System.out.println("数字90的下标是"+mid);
    }
}
