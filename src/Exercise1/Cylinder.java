public class Cylinder extends Circle {  
   private double height;

   // Constructors
   public Cylinder() {
      super();        
      height = 1.0;
   }

   public Cylinder(double height) {
      super();        
      this.height = height;
   }

   public Cylinder(double radius, double height) {
      super(radius);  
      this.height = height;
   }

   // Getter
   public double getHeight() { return height; }

   // [Task 1.2] Override getArea -> luas permukaan tabung
   @Override
   public double getArea() {
      double r = getRadius();
      return 2 * Math.PI * r * height + 2 * super.getArea();
   }

   public double getVolume() {
      return super.getArea() * height;
   }

   // [Task 1.3] Override toString
   @Override
   public String toString() {
      return "Cylinder: subclass of " + super.toString()
             + " height=" + height;
   }
}
