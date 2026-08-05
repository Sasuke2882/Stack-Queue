package TestStack;

public class Test {
	public static void main(String[] args) {
		//测试栈
		Stack s=new Stack();
		for(int i=1;i<=10;i++) {s.push(i);}
		System.out.println(s.length());
		for(int i=0;i<s.length();i++) {System.out.print(s.point(i)+" ");}
		System.out.print("\n");
		s.pop();
		for(int i=0;i<s.length();i++) {System.out.print(s.point(i)+" ");}
		System.out.print("\n");
		s.empty();
		System.out.println(s.isEmpty());
		//测试队列
		Queue q=new Queue();
		for(int i=1;i<=10;i++) {q.push(i);}
		System.out.println(q.length());
		for(int i=0;i<q.length();i++) {System.out.print(q.point(i)+" ");}
		System.out.print("\n");
		q.pop();
		for(int i=0;i<q.length();i++) {System.out.print(q.point(i)+" ");}
		System.out.print("\n");
		q.empty();
		System.out.println(q.isEmpty());
	}
}
