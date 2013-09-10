import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GiaiPTB1Test {
	GiaiPTB1 pt = new GiaiPTB1();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		double kq= pt.giaipt(1f, 1f);
		assertEquals(kq, -1f, 0f);
	}
	@Test
	public void test2()
	{
		double kq = pt.giaipt(10f, 9f);
		assertEquals(kq, -9f,9f);
	}
}
