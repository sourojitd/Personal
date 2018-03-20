import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<Integer>();
		a.add(2); a.add(9); a.add(6); a.add(0); a.add(1); a.add(8); a.add(7);
		List<Integer> b=insertSort(a);
		System.out.println("Original:"+a);
	}

	public static List<Integer> insertSort(List<Integer> numbers){
		List<Integer> sorted=new LinkedList<>();
		
		originalList:for(Integer num:numbers) {
			for(int i=0;i<sorted.size();i++) {
				if(num<sorted.get(i)) {
				sorted.add(i,num);
				continue originalList;
				}
			}
			sorted.add(sorted.size(),num);
		}
		System.out.println(sorted);
		return sorted;
		
	}
	
	
}
