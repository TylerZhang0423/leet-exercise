//912. 排序数组
//给定一个整数数组 nums，将该数组升序排列。
//示例 1：
//输入：[5,2,3,1]
//输出：[1,2,3,5]
//示例 2：
//输入：[5,1,1,2,0,0]
//输出：[0,0,1,1,2,5]
//提示：
//1 <= A.length <= 10000
//-50000 <= A[i] <= 50000
package sortanarray;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray={5,2,3,1};
		Solution Test=new Solution();
		int[] resultArray=Test.sortArray(testArray);
		for (int i=0;i<resultArray.length;i++) {
			System.out.print(resultArray[i]+" ");
		}
	}
}
