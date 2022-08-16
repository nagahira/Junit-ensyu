package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsEven1() {
		boolean bool = NumberUtils.isEven(10);
		assertEquals(true, bool,"tc1:値が間違っています。");
	}
	
	@Test
	void testIsEven2() {
		boolean bool = NumberUtils.isEven(7);
		assertEquals(false, bool,"tc2:値が間違っています。");
	}


}
