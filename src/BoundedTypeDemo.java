import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class BoundedTypeDemo {
   public void main(String[] args) {
          Rectangle rectangle = new Rectangle(2, 2);
          Circle circle = new Circle(2);

          System.out.println("Same area? " + equalArea(rectangle, circle));
          }

    private static String equalArea(Rectangle rectangle, Circle circle) {
        return null;
    }

    public static <E extends GeometricObject> boolean equalArea(
  E object1, E object2) {
         // return object1.getArea() == object2.getArea();
        return false;
    }
  }