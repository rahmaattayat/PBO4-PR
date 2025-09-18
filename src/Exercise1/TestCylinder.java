public class TestCylinder {
   public static void main (String[] args) {
      // default
      Cylinder c1 = new Cylinder();
      System.out.println(c1.toString());
      System.out.println("Surface area = " + c1.getArea());
      System.out.println("Volume = " + c1.getVolume());

      // tinggi saja
      Cylinder c2 = new Cylinder(10.0);
      System.out.println(c2.toString());
      System.out.println("Surface area = " + c2.getArea());
      System.out.println("Volume = " + c2.getVolume());

      // radius & tinggi
      Cylinder c3 = new Cylinder(2.0, 10.0);
      System.out.println(c3.toString());
      System.out.println("Surface area = " + c3.getArea());
      System.out.println("Volume = " + c3.getVolume());
   }
}
