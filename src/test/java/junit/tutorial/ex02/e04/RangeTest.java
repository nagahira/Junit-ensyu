package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {
	Range range;

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

	@Nested
	class ran {
		@BeforeEach
		void setup() {
			range = new Range(0.0, 10.5);
		}

		@ParameterizedTest
		@ValueSource(doubles = { -0.1, 10.6 })
		void testContains1(double n) {
			assertFalse (range.contains(n));
		}

		
		@ParameterizedTest
		@ValueSource(doubles = { 0.0, 10.5,})
		void testContains2(double n) {
			assertTrue(range.contains(n));
		}
	}
	
	@Nested
	class ran2 {
		@BeforeEach
		void setup() {
			range = new Range(-5.1, 5.1);
		}

		@ParameterizedTest
		@ValueSource(doubles = { -5.2, 5.2 })
		void testContains1(double n) {
			assertFalse (range.contains(n));
		}

		
		@ParameterizedTest
		@ValueSource(doubles = { -5.1, 5.1,})
		void testContains2(double n) {
			assertTrue(range.contains(n));
		}
	}
}
