package myPackage;
import java.util.Random;

public class Model {
	
	Random random = new Random();
	
	public int add2NUmbers() {
		int a = random.nextInt(19);
		int b = random.nextInt(19);
		return a+b;
	}
	
	public int sum(int a, int b) {
		return a+b;
	}

}
