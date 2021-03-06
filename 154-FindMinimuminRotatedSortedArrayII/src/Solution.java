/**
 * @author ：Tyler Zhang
 * @date ：Created in 2020-05-08 22:03
154. 寻找旋转排序数组中的最小值 II
假设按照升序排序的数组在预先未知的某个点上进行了旋转。
( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
请找出其中最小的元素。
注意数组中可能存在重复的元素。
示例 1：
输入: [1,3,5]
输出: 1
示例 2：
输入: [2,2,2,0,1]
输出: 0
 */
public class Solution {
    public int findMin(int[] numbers) {
        int front = 0;
        int end = numbers.length-1;
        int mid = 0;
        while (end - front>1) {
            mid = (front + end) / 2;
            if (numbers[front] > numbers[mid]) {
                end = mid;
            }else if (numbers[mid] > numbers[end]) {
                front = mid;
            }else if (numbers[mid] == numbers[end] || numbers[front] == numbers[mid]) {
                while (numbers[end] == numbers[mid] && end != mid) {
                    end--;
                }
                while (numbers[front] == numbers[mid] && front != mid) {
                    front++;
                }
            }else {
                return numbers[front];
            }
        }
        return Integer.min(numbers[front],numbers[end]);
    }
}