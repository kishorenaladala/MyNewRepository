
public class AbstractClassDemo  extends Bike{
	
	@Override
	void run() {
		System.out.println("The bike spped is"+60);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bike b=new AbstractClassDemo();
		b.run();
	}

	

}
