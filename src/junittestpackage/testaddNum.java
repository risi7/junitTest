package junittestpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddNum {

	@Test
	void test() {
		jutfunction junit=new jutfunction();
		int result = junit.addNum(100, 200);
		assertEquals(300, result);
	}

}
