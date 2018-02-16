import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest {

	@Test
	public void defaultRectangleTest() {
		Rectangle rectangle = new Rectangle();
		assertEquals(1, rectangle.getHeight());
		assertEquals(1, rectangle.getWidth());
		assertEquals(1, rectangle.getArea());
		assertEquals(4, rectangle.getPerimeter());
	}

	@Test
	public void rectangleTest() {
		Rectangle rectangle = new Rectangle(4, 2);
		assertEquals(4, rectangle.getHeight());
		assertEquals(2, rectangle.getWidth());
		assertEquals(8, rectangle.getArea());
		assertEquals(12, rectangle.getPerimeter());
	}

}
