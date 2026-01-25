package exception_handling;

public class CheckedExceptionDemo {
	public static void main(String[] args) throws ClassNotFoundException{
		//1. try - catch
		System.out.println("Program started");
//		try {
		Class.forName(" ");
//		}
//		catch(ClassNotFoundException c)
//		{
//			System.out.println("Exception handled");
//			
//		}
		System.out.println("Program ended");
	}

}
