package net.kuwalab.jenkins;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
	@Test
	public void testAdd() {
		Assert.assertThat(Calc.add(2, 3), is(5));
		Assert.assertThat(Calc.add(1, 3), is(4));
	}
}
