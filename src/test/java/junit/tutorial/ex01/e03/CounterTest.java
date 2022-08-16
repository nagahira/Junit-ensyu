package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	Counter counter;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		counter = new Counter();
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void testIncrement1() {
		int i = counter.increment();
		assertEquals(1, i,"tc1:数値が違います");
	}
	
	@Test
	void testIncrement2() {
		int num = 0;
		counter.increment();
		num = counter.increment();
		assertEquals(2, num,"tc2:数値が違います");
	}

	@Test
	void testIncrement3() {
		int count = 0;
		for(int i = 0; i <= 50; i++) {
			count = counter.increment();
		}
		
		assertEquals(51, count,"tc3:数値が違います");
	}


}
