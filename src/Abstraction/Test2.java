package Abstraction;

public class Test2 {
	public static void main(String[] args) {
		Course c1=new OnlineCourse("JAVA",500);
		c1.courseInfo();
		c1.coursePrice();
		
		Course c2= new OnlinePaidCourse("OOPS",500,1000);
		c2.courseInfo();
		c2.coursePrice();
	}

}
