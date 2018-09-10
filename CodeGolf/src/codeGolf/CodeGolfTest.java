package codeGolf;

import org.junit.Assert;
import org.junit.Test;

public class CodeGolfTest {

	@Test
	public void ejemplo1() {
		Integer[] vector = {1, 4, 10, -2, 0};
		Assert.assertEquals(true, CodeGolf.secuenciaCiclica(vector));
	}
	
	@Test
	public void ejemplo2() {
		Integer[] vector = {-2, 0, -1};
		Assert.assertEquals(false, CodeGolf.secuenciaCiclica(vector));
	}
	
	@Test
	public void ejemplo3() {
		Integer[] vector = {1};
		Assert.assertEquals(true, CodeGolf.secuenciaCiclica(vector));
	}
	
	@Test
	public void ejemplo4() {
		Integer[] vector = {1,2,3,4,5,6};
		Assert.assertEquals(true, CodeGolf.secuenciaCiclica(vector));
	}
	
	@Test
	public void ejemplo5() {
		Integer[] vector = {1,2,3,4,5,-4, 8};
		Assert.assertEquals(false, CodeGolf.secuenciaCiclica(vector));
	}

}
