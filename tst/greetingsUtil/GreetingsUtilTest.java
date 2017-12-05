package greetingsUtil;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingsUtilTest {
	
	static GreetingsUtil gu;
	String actual;
	String expected;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		gu=new GreetingsUtil();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Before
	void setUp() throws Exception {
		

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testHelloIf() {
		expected="You already said that";
		actual=gu.Hello();
		//System.out.println("actual:"+actual);
		assertTrue(actual.equals(expected));
	}
	@Test
	void testHelloElse() {
		expected="Hi!";
		actual=gu.Hello();
		//System.out.println(actual);
		assertTrue(actual.equals(expected));
		
	}
	@Test
	void testChangeStateIf() {
		expected="going";
		actual=gu.ChangeState();
		//System.out.println(actual);
		assertTrue(actual.equals(expected));
		}
	
	@Test
	void testChangeStateElse() {
		expected="coming";
		actual=gu.ChangeState();
		//System.out.println(actual);
		assertTrue(actual.equals(expected));
		}
	
	@Test
	void testGoodByeIf() {
		expected="You already said that";
		actual=gu.GoodBye();
		//System.out.println(actual);
		assertTrue(actual.equals(expected));	
	}
	
	@Test
	void testGoodByeElse() {
		expected="bye";
		actual=gu.GoodBye();
		//System.out.println(actual);
		assertTrue(actual.equals(expected));
		}

	
}
