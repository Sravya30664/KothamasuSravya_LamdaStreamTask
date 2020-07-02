import java.util.function.*;
import java.util.*;
import java.util.stream.*;
public class StartWith {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strArray = {"apple","bat","cat","alarm","book","laptop","armour"};
		List<String> strList = Arrays.asList(strArray);
		List<String> resultList = getString(strList, (String str) -> str);
		System.out.println(resultList);	
	}
	public static List<String> getString(List<String> list, Function<String, String> function) {
		  //List<String> result =  new ArrayList<>();
		  List<String> result = list.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
		  return result;

	}
}

