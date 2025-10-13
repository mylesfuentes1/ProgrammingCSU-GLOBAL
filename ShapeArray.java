
public class ShapeArray {

	public static void main(String[] args) {
		Shape triangle = new Triangle(3,5,3);
		Shape circle = new Circle(8);
		Shape square = new Rectangle(7,7);
		
		Shape[] shapeArray = {triangle, circle, square};
		
		for (Shape shape : shapeArray) {
			System.out.println(shape.toString());
			
		}

	}

}
