package TestStack;
import java.util.ArrayList;
import java.util.List;
public class Queue {
	private boolean truth=false;
	List<Object> q=new ArrayList<>();
	public Queue() {this.q=q;}
	public void push(Object a) {q.add(a);}
	public int length() {return q.size();}
	public void pop() {q.remove(q.get(0));}
	public Object top() {return q.get(0);}
	public Object point(int b) {return q.get(b);}
	public void empty() {
		for(int i=0;i<q.size();i++) {q.set(i,null);}
		this.truth=true;
	}
	public boolean isEmpty() {return truth;}
}
