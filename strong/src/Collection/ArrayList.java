package Collection;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList {
	public static void main(String[] args) {
		ArrayList a=new ArrayList(Array.asList(100,"Ram",'c',12.5,null));
		
		try {
			System.out.println(linearSearch(a, 100)==true?"Found":"Not Found");	
		}
		catch(Exception e) {
			System.out.println("Not found");
		}
		
	}
	private int size;
	public static boolean linearSearch(ArrayList a,Object find) {
		for(int i=0;i<=a.size-1;i++) {
			if(a.get(i).equals(find)) {
				return true;
				
			}
		}
		return false;
		
		
	}
	private Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}


}
