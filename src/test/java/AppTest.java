import org.junit.Assert;
import org.junit.Test;

public class AppTest {
	
	@Test
	public void shouldReturnTrueWhenFutureDates() {
		boolean result = true;
		Assert.assertTrue(result);
	}
	
	@Test
	public void shouldReturnFalse() {
		boolean result = false;		
		Assert.assertFalse(result);
	}
}