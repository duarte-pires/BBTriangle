import triangle.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {
   @Test
   public void testImpossible() {
      Triangle t = new Triangle(1, 2, 3);
      assertEquals(false, t.isImpossible());
   }
   @Test
   public void testImpossible1() {
      Triangle t = new Triangle(1, 2, 0);
      assertEquals(true, t.isImpossible());
   }
   @Test
   public void testEquilateral() {
      Triangle t = new Triangle(1, 1, 1);
      assertEquals(true, t.isEquilateral());
   }
   @Test
   public void testEquilateral2() {
      Triangle t = new Triangle(1, 1, 3);
      assertEquals(false, t.isEquilateral());
   }
   @Test
   public void testEquilateral3() {
      Triangle t = new Triangle(1, 1, 0);
      assertEquals(false, t.isEquilateral());
   }
   @Test
   public void testEquilateral4() {
      Triangle t = new Triangle(1, -1, 0);
      assertEquals(false, t.isEquilateral());
   }/* 
   @Test
   public void testIsosceles() {
      Triangle t = new Triangle(1, 1, 2);
      assertEquals(Triangle.P_ISOSCELES, t.getType());
   }
   @Test
   public void testScalene() {
      Triangle t = new Triangle(1, 2, 3);
      assertEquals(Triangle.P_SCALENE, t.getType());
   }
   @Test
   public void testRightAngled() {
      Triangle t = new Triangle(3, 4, 5);
      assertEquals(Triangle.P_RIGHTANGLED, t.getType());
   } */  
}
