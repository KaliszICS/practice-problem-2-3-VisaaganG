import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PracticeProblemTest {

   @Test
   void radiusTest1() {
      assertEquals(Math.PI * 9, PracticeProblem.circleArea(3));
   }

   @Test
   void radiusTest2() {
      assertEquals(Math.PI * 16, PracticeProblem.circleArea(-4));
   }

   @Test
   void radiusTest3() {
      assertEquals(Math.PI * 0, PracticeProblem.circleArea(0));
   }

   @Test
   void radiusTest4() {
      assertEquals(Math.PI * 15129, PracticeProblem.circleArea(123));
   }

      @Test
   void radiusTest5() {
      assertEquals(Math.PI * 6.70 * 6.70, PracticeProblem.circleArea(6.70));
   }

      @Test
   void minuteTest1() {
      assertEquals("6 hours and 0 minutes", PracticeProblem.minutesToHours(360));

   }


      @Test
   void minuteTest2() {
      assertEquals("0 hours and 1 minutes", PracticeProblem.minutesToHours(1));

   }

       @Test
   void minuteTest3() {
      assertEquals("-1 hours and 0 minutes", PracticeProblem.minutesToHours(-60));

   }

      @Test
   void minuteTest4() {
      assertEquals("0 hours and 0 minutes", PracticeProblem.minutesToHours(0));

   }

       @Test
   void minuteTest5() {
      assertEquals("1 hours and 22 minutes", PracticeProblem.minutesToHours(82));

   }

      @Test
   void interestTest1() {
      assertEquals(0.0, PracticeProblem.simpleInterest(0, 0, 0));

   }

      @Test
   void interestTest2() {
      assertEquals(10 * (72/100.0) * 98, PracticeProblem.simpleInterest(10, 72, 98));
   }
      @Test
   void interestTest3() {
      assertEquals(-10 * (-72/100.0) * -98, PracticeProblem.simpleInterest(-10, -72, -98));

   }
       @Test
   void interestTest4() {
      assertEquals(10000000 * (720000000/100.0) * 980000000, PracticeProblem.simpleInterest(10000000, 720000000, 980000000));

}

      @Test
   void interestTest5() {
      assertEquals(6.7 * (2.1/100.0) * 8, PracticeProblem.simpleInterest(6.7, 2.1, 8));

}

       @Test
   void hypotenuse1() {
      assertEquals(0, PracticeProblem.hypotenuse(0, 0));

}

       @Test
   void hypotenuse2() {
      assertEquals(5, PracticeProblem.hypotenuse(3, 4));

}

      @Test
   void hypotenuse3() {
      assertEquals(500000000, PracticeProblem.hypotenuse(300000000, 400000000));

}

       @Test
   void hypotenuse4() {
      assertEquals(0.5, PracticeProblem.hypotenuse(0.3, 0.4));

}

       @Test
   void hypotenuse5() {
      assertEquals(Math.sqrt(312 * 312 + 142 * 142), PracticeProblem.hypotenuse(312, 142));
}

}
