package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMy {
	

		public static void main(String[] args) {
			Queue<Integer> q=new LinkedList<Integer>();
			q.add(1);
			q.add(2);
			q.add(4);
			System.out.println(q);
			
			System.out.println("----------------------");
			q.addAll(q);
			System.out.println(q.addAll(q));
			
			System.out.println("-----------------------");
			q.remove();
			System.out.println(q.remove(2));
			
			System.out.println("-----------------------");
			q.removeAll(q);
			System.out.println(q.removeAll(q));
			
			System.out.println("------------------------");
			q.contains(q);
			System.out.println(q.contains(q));
		
			System.out.println("-----------------------");
			q.isEmpty();
			System.out.println(q.isEmpty());
			
			System.out.println("-----------------------");
			q.clear();
			System.out.println();
			
			System.out.println("-----------------------");
			q.size();
			System.out.println(q.size());
		}

	}


