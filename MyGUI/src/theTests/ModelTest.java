package theTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import myPackage.*;

class ModelTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		//setup
				int a = 2;
				int b = 3;
				Model model = new Model(); 
				int result = model.sum(a, b);
				
				
				//assert
				assertEquals(5, result);
				
	}

}
