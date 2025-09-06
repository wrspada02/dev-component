public class Square implements IShape {
 private ShapeType type = ShapeType.SQUARE;
 
 public void draw() {
   System.out.println("Drawing a square");
 }

 public ShapeType getType() {
   return type;
 }
}
