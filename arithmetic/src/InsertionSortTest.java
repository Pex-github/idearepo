import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Arrays;

/**
 * @Auther:PEX
 * @Date:2020/7/29-11:39
 * @Description: PACKAGE_NAME
 * @version:1.8
 */
public class InsertionSortTest {

    public static void selectionSort(int[] arr){
        if(arr ==null || arr.length < 2){
            return ;
        }
        for (int i = 0;i < arr.length;i++){
            int minIndex = i;
            for (int j = i+1;j < arr.length;j++){
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            biJiao(arr,i,minIndex);
        }
    }
    public static void biJiao(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] =tmp;
    }

    //对数器
    public static void comparator(int[] arr){
        Arrays.sort(arr);
    }
    public static int[] generateRandomArray(int maxSize,int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0;i< arr.length;i++){
            arr[i] = ((maxValue + 1)*())
        }

    }
}
