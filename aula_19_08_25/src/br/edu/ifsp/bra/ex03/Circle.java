public class Circle implements IShape {
 private ShapeType type = ShapeType.CIRCLE;
 
 public void draw() {
   System.out.println("Drawing a circle");
 }

 public ShapeType getType() {
   return type;
 }
}

