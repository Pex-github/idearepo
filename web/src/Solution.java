/**
 * @Auther:PEX
 * @Date:2020/8/4-11:25
 * @Description: PACKAGE_NAME
 * @version:1.8
 */
public class Solution {
    public static int[] twoSum(int[] num, int target) throws IllegalAccessException {
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[j]==target-num[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalAccessException("NO two sum");
    }
    public static void main(String[] args) throws IllegalAccessException {
        int[] num ={4,8,9,10,13};
        int target =17;
        int[] v =twoSum(num,target);
        for(int i:v){
            System.out.println(i);
        }
    }
}
