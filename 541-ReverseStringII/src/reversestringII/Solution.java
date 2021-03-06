//541. 反转字符串 II
//给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。
//如果剩余少于 k 个字符，则将剩余的所有全部反转。
//如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
//示例:
//输入: s = "abcdefg", k = 2
//输出: "bacdfeg"
//要求:
//该字符串只包含小写的英文字母。
//给定字符串的长度和 k 在[1, 10000]范围内。
package reversestringII;

public class Solution {
    public String reverseStr(String s, int k) {
        int flag=0;
        String res="";
        for (int i=0;i+k<=s.length();i=i+k) {
        	if (flag%2==0) {
        		res=res+reverse(s.substring(i, i+k));
        	}else {
        		res=res+s.substring(i, i+k);
        	}
        	flag++;
        }
        if (flag%2==0) {
        	res=res+reverse(s.substring(s.length()-s.length()%k, s.length()));
        }else {
        	res=res+s.substring(s.length()-s.length()%k, s.length());
        }
        return res;
    }
    public String reverse(String r) {
    	char[] c=r.toCharArray();
    	char temp=' ';
        for (int i=0;i<c.length/2;i++) {
        	temp=c[i];
        	c[i]=c[c.length-1-i];
        	c[c.length-1-i]=temp;
        }
        return String.valueOf(c);
    }
}
