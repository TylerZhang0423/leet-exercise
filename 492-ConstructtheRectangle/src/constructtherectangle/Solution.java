//492. �������
//��Ϊһλweb�����ߣ� ��������ȥ�滮һ��ҳ��ĳߴ��Ǻ���Ҫ�ġ�
//�ָ���һ������ľ���ҳ�������������������һ������Ϊ L �Ϳ���Ϊ W ����������Ҫ��ľ��ε�ҳ�档
//Ҫ��
//1. ����Ƶľ���ҳ�������ڸ�����Ŀ�������
//2. ���� W ��Ӧ���ڳ��� L������֮��Ҫ�� L >= W ��
//3. ���� L �Ϳ��� W ֮��Ĳ��Ӧ��������С��
//����Ҫ��˳���������Ƶ�ҳ��ĳ��� L �Ϳ��� W��
//ʾ����
//����: 4
//���: [2, 2]
//����: Ŀ������� 4�� ���п��ܵĹ��췽���� [1,4], [2,2], [4,1]��
//���Ǹ���Ҫ��2��[1,4] ������Ҫ��; ����Ҫ��3��[2,2] �� [4,1] ���ܷ���Ҫ��. ����������� L Ϊ 2�� ���� W Ϊ 2��
//˵��:
//��������������� 10,000,000 ��Ϊ��������
//����Ƶ�ҳ��ĳ��ȺͿ��ȱ��붼����������
package constructtherectangle;

public class Solution {
    public int[] constructRectangle(int area) {
    	int[] result=new int[2];
    	for (int i=(int)Math.ceil(Math.sqrt(area));i<=area;i++) {
    		if (area%i==0) {
    			result[0]=i;
    			result[1]=area/i;
    			break;
    		}
    	}
    	return result;
    }
}