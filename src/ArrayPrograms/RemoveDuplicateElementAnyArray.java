package ArrayPrograms;

import java.util.HashSet;

public class RemoveDuplicateElementAnyArray {
	public static void main(String[] args) {
		int [] a= {1,2,3,3,2,5,8,6};
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<a.length;i++) {
		    hs.add(a[i]);
		    
		}
		for (int no:hs) {
			System.out.print(no + " ");
		}
		}

	}
	


