package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {
	ItemStock itemStock;
	Item item;
	Item item2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		itemStock = new ItemStock();
		item = new Item("book", 1000);
		item2 = new Item("CD", 1200);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetNum1() {
		
		assertEquals(0,itemStock.getNum(item),"tc1:初期値が０ではありません");
	}

	@Test
	void testAdd1() {
		
		itemStock.add(item);
		assertEquals(1, itemStock.getNum(item),"tc2:add後の値が不正です");
	}
	
	@Test
	void testAdd2() {
		itemStock.add(item);
		int it = itemStock.getNum(item);
		assertEquals(1, it,"tc2:add後の値が不正です");
	}
	
	@Test
	void testAdd3() {
		itemStock.add(item);
		itemStock.add(item);
		int it = itemStock.getNum(item);
		assertEquals(2, it,"tc3:2回目add後の値が不正です");
	}
	
	@Test
	void testAdd4() {
		itemStock.add(item);
		itemStock.add(item2);
		int it = itemStock.getNum(item);
		assertEquals(1, it,"tc4:値が不正です");
	}

}
