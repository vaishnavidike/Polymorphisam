package StreamBasic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(5,1,2,4,3));
		
		Stream<Integer> s=a.stream();
//		
//		s.forEach(x->System.out.println(x));
//		s.count();
//		System.out.println("Size of stream:"+1);
//		Function<Integer, Integer> f=(t)->{return t*t;};
		
//		s.map(f).forEach(b->System.out.println(b));
//		s.map(h->h*h).filter(x->x%2==0).forEach(b->System.out.println(b));
		
//		Stream<Integer> s1=s.sorted();
//		s1.forEach(x->System.out.println(x));
		
		BinaryOperator<Integer> b=new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
			
		};
		Optional j=s.reduce(b);
		System.out.println("Res :  "+j.get());
		
	}

}
