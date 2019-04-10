package junittestpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddStr {

	@Test
	void test() {
		jutfunction a = new jutfunction();
		String r = a.addStr("Hello", "World");
		assertEquals("HelloWorld", r);
	}

}
