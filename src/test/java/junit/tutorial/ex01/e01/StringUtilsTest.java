package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

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
	void testToSnakeCase1() {
		String text = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", text,"TC1:テストケースが一致しません");
	}
	

	@Test
	void testToSnakeCase2() {
		String text = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", text,"TC2:テストケースが一致しません");
	}
	

	@Test
	void testToSnakeCase3() {
		String text = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", text,"TC3:テストケースが一致しません");
	}

}
