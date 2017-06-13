package base;

import org.junit.Test;
import static org.junit.Assert.*;
import base.HomeController;;

public class HomeControllerTest {
	@Test
	public void homePageTest() {
		HomeController controller = new HomeController();
		assertEquals(controller.index(), "index.html");
	}
}
