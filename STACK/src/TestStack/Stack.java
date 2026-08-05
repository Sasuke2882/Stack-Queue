package TestStack;
import java.util.ArrayList;
import java.util.List;
public class Stack {
	private boolean truth=false;
	List<Object> s=new ArrayList<>();
	public Stack() {this.s=s;}
	public void push(Object a) {s.add(a);}
	public int length() {return s.size();}
	public void pop() {s.remove(s.get(s.size()-1));}
	public Object top() {return s.get(0);}
	public Object point(int b) {return s.get(b);}
	public void empty() {
		for(int i=0;i<s.size();i++) {s.remove(s.get(i));}
		this.truth=true;
	}
	public boolean isEmpty() {return truth;}
}
