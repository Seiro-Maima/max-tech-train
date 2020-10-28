package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void testPirateCreate() {
		Pirate p1 = new Pirate("Captin Hook");
		assertEquals("Captin Hook", p1.getName());
		assertEquals(4, p1.getLimbsRemaining());
		// no pirates should be dead as soon as they are created
		assertFalse(p1.isDead());
	}

	@Test
	public void testOctoPirateCreate() {
		Pirate p1 = new Pirate("Octo Pirate", 8);
		assertEquals(8, p1.getLimbsRemaining());
	}

	// test method does not take longer than a certain duration
	@Test(timeout=1000)
	public void testInfiniteLoop() {
		int i = 0;
		while(true) {
			System.out.println(i + ": Infinite Loop!!!");
			i++;
		}
	}
	
	
	
}
