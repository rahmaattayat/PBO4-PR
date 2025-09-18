   public class Circle {  
      // private instance variables
      private double radius;
      private String color;

      // Constructors
      public Circle() {             
         radius = 1.0;
         color = "red";
      }

      public Circle(double r) {     
         radius = r;
         color = "red";
      }

      // [Task 1.1] Constructor with radius & color
      public Circle(double r, String c) {
         radius = r;
         color = c;
      }

      // Getter & Setter
      public double getRadius() { return radius; }
      public String getColor() { return color; }
      public void setColor(String c) { color = c; }

      // Area
      public double getArea() {
         return radius * radius * Math.PI;
      }

      // toString
      @Override
      public String toString() {
         return "Circle[radius=" + radius + " color=" + color + "]";
      }
   }
