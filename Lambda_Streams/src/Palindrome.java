import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strArray = {"mom","honey","Madam","ababc","aabaa"};
		List<String> strList = Arrays.asList(strArray);
		List<String> resultList = getPalindrome(strList, (String str) -> str);
		System.out.println(resultList);	

	}
	public static List<String> getPalindrome(List<String> list, Function<String, String> function) {
		List<String> l=new ArrayList<String>();
		for(String i:list) {
			StringBuffer sb=new StringBuffer(i);
			sb=sb.reverse();
			String s=sb.toString();
			if(s.equalsIgnoreCase(i)){
				l.add(i);
			}
			
		}
		return l;
}
}