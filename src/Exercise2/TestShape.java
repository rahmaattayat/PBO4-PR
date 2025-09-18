public class TestShape {
  public static void main(String[] args) {
    Shape s1 = new Shape();
    Shape s2 = new Shape("blue", false);
    System.out.println(s1);
    System.out.println(s2);

    Circle c1 = new Circle();
    Circle c2 = new Circle(2.5, "yellow", true);
    System.out.println(c1 + " | area=" + c1.getArea() + " perimeter=" + c1.getPerimeter());
    System.out.println(c2 + " | area=" + c2.getArea() + " perimeter=" + c2.getPerimeter());

    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(3, 4, "black", false);
    System.out.println(r1 + " | area=" + r1.getArea() + " perimeter=" + r1.getPerimeter());
    System.out.println(r2 + " | area=" + r2.getArea() + " perimeter=" + r2.getPerimeter());

    Square sq1 = new Square(5, "pink", true);
    System.out.println(sq1 + " | area=" + sq1.getArea() + " perimeter=" + sq1.getPerimeter());
    sq1.setWidth(7);
    System.out.println("After setWidth(7): " + sq1 + " | side=" + sq1.getSide());
  }
}
