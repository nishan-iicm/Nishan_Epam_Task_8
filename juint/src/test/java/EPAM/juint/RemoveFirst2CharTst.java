package EPAM.juint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirst2CharTst {

	/* TODO List for my feature
	 * 1."ABCD" =>'"BCD"
	 * 2."AACD" => "CD"
	 * 3."BACD" => "BCD"
	 * 4."BCDE" =>"BCDE"
	 * 5."AABCAA"=>"BCAA"
	 */
	RemoveFirst removefirst;
	@BeforeEach
	void create() {
	removefirst=new RemoveFirst();
	}
	
	@Test
	void test1() {
		assertEquals("BCD",removefirst.remove("ABCD"));
	}
	@Test
	void test2() {
		assertEquals("CD",removefirst.remove("AACD"));
	}
	@Test
	void test3() {
		assertEquals("BCD",removefirst.remove("BACD"));
	}
	@Test
	void test4() {
		assertEquals("BCDE",removefirst.remove("BCDE"));
	}
	@Test
	void test5() {
		assertEquals("BCDAA",removefirst.remove("AABCDAA"));
	}

}
