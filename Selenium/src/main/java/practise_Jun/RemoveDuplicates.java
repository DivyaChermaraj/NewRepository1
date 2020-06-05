package practise_Jun;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[] = {2,2,2,2,3,4,4,4,5,5,6,8,8};
int n=array.length;
Set<Integer> remove = new LinkedHashSet<Integer>();
for(int i=0;i<n;i++) {
	for (int j=i+1; j<n;j++) {
		if(array[j]==array[i])
			remove.add(array[i]);
		
	}
	}

	System.out.println(remove);
	System.out.println();
	}
	}
