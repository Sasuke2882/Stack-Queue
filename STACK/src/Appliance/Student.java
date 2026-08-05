package Appliance;
public class Student {
	private String name;
	private int isPass;
	public Student(String name,int isPass){
		this.name=name;
		this.isPass=isPass;
	}
	public String getName() {return name;}
	public int getPass() {return isPass;}
	public void setPass() {this.isPass=1;}
}
