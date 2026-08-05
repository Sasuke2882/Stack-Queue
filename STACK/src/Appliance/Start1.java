package Appliance;
import TestStack.Queue;
import java.util.Scanner;
import java.util.Random;
public class Start1 {
	public static void main(String[] args) {
		Queue q=new Queue();
		Random i0=new Random();
		Scanner s=new Scanner(System.in);
		while(true) {
			String n=s.next();
			if(n.equals("n")) {break;}
			int i1=i0.nextInt(2);
			System.out.println(i1);
			Student stu=new Student(n,i1);
			q.push(stu);
		}
		while(q.length()!=0) {
			if(((Student)q.top()).getPass()==0) {((Student) q.top()).setPass();}
			q.pop();
			for(int i=0;i<q.length();i++) {System.out.println(((Student) q.point(i)).getName());}
		}
	}
}
