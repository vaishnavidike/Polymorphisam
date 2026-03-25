package ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		Stream<Integer> s=a.stream();
		Function<Integer, Integer> f=new Function<Integer , Integer>(){

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*t;
			}
		};
		s.map(f).forEach(b->System.out.println(b));
}
}
