//230. �����������е�KС��Ԫ��
//����һ����������������дһ������ kthSmallest ���������е� k ����С��Ԫ�ء�
//˵����
//����Լ��� k ������Ч�ģ�1 �� k �� ����������Ԫ�ظ�����
//ʾ�� 1:
//����: root = [3,1,4,null,2], k = 1
//   3
//  / \
// 1   4
//  \
//   2
//���: 1
//ʾ�� 2:
//����: root = [5,3,6,2,4,null,null,1], k = 3
//       5
//      / \
//     3   6
//    / \
//   2   4
//  /
// 1
//���: 3
package KthsmallestelementinaBST;

public class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { val = x; }
}