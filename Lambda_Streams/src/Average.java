import java.util.function.*;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
	      IntSummaryStatistics summaryStats = list.stream().mapToInt((a) -> a).summaryStatistics();
	      System.out.println("Average of a List = "+summaryStats.getAverage());
	}

}
